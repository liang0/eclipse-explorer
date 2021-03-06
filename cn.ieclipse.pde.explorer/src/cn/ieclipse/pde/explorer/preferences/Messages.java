/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.pde.explorer.preferences;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "cn.ieclipse.pde.explorer.preferences.messages"; //$NON-NLS-1$
	public static String ExplorerPreferencePage_cmd;
	public static String ExplorerPreferencePage_desc;
	public static String ExplorerPreferencePage_eg;
    public static String ExplorerPreferencePage_note;
    public static String ExplorerPreferencePage_tip;
    public static String OpenExplorerHandler_dia_msg;
    public static String OpenExplorerHandler_dia_prt;
    public static String OpenExplorerHandler_dia_title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
