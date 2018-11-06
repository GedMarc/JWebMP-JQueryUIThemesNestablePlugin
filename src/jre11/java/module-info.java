import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.jqueryui.themesnested.JQUINestableThemesPageConfigurator;
import com.jwebmp.plugins.jqueryui.themesnested.implementations.JQueryUINestableThemesExclusionsModule;

module com.jwebmp.plugins.jqueryui.themes.nestable {

	exports com.jwebmp.plugins.jqueryui.themesnested;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQUINestableThemesPageConfigurator;

	provides IGuiceScanJarExclusions with JQueryUINestableThemesExclusionsModule;
	provides IGuiceScanModuleExclusions with JQueryUINestableThemesExclusionsModule;

	opens com.jwebmp.plugins.jqueryui.themesnested to com.fasterxml.jackson.databind, com.jwebmp.core;
}
