module com.jwebmp.plugins.jqueryui.themes.nestable {

	exports com.jwebmp.plugins.jqui.themesnested;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqui.themesnested.JQUINestableThemesPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.jqui.themesnested.implementations.JQueryUINestableThemesExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.themesnested.implementations.JQueryUINestableThemesExclusionsModule;

	opens com.jwebmp.plugins.jqui.themesnested to com.fasterxml.jackson.databind, com.jwebmp.core;
}
