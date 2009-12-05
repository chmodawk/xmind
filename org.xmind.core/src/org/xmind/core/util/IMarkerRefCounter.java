/* ******************************************************************************
 * Copyright (c) 2006-2009 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.core.util;

/**
 * Example:
 * 
 * <pre>
 * IWorkbook workbook = ....
 * IMarkerRefCounter counter = (IMarkerRefCounter) workbook.getAdaptable(IMarkerRefCounter.class);
 * String markerId = ....
 * counter.increaseRef(markerId);
 * ....
 * </pre>
 * 
 * @author MANGOSOFT
 */
public interface IMarkerRefCounter extends IRefCounter {

}