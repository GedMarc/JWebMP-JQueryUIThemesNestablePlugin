import com.jwebmp.plugins.jqui.themesnested.implementations.JQUINestableThemes;

module com.jwebmp.plugins.jqueryui.themes.nestable {

	exports com.jwebmp.plugins.jqui.themesnested;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqui.themesnested.JQUINestableThemesPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.themesnested.implementations.JQueryUINestableThemesExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with JQUINestableThemes;
	
	opens com.jwebmp.plugins.jqui.themesnested to com.fasterxml.jackson.databind, com.jwebmp.core;
}
