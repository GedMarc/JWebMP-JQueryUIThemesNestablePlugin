/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqui.themesnested;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.htmlbuilder.css.themes.Theme;

/**
 * Implements the UI-Lightness Theme from JQuery UI Theme Roller
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/07/05
 */
class SouthStreetThemeNestable
		extends Theme
{

	public SouthStreetThemeNestable()
	{
		super("South Street", "uisouthstreet", "css/theming/images/theme_30_south_street.png", "", "css/theming/images/theme_90_south_street.png");
		getCssReferences().add(new CSSReference("southstreetTheme", 1.114, "css/theming/ui_southstreet_theme.css",
		                                        "https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/south-street/jquery-ui.css"));

	}

}
