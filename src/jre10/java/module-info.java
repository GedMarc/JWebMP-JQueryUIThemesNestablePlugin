import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqueryui.themes.JQUINestableThemesPageConfigurator;

module com.jwebmp.plugins.jqueryui {

	exports com.jwebmp.plugins.jqueryui.themes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with JQUINestableThemesPageConfigurator;
	opens com.jwebmp.plugins.jqueryui.themes to com.fasterxml.jackson.databind,com.jwebmp.core;
}
