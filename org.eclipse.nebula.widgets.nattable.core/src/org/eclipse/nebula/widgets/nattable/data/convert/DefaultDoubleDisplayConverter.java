/*******************************************************************************
 * Copyright (c) 2012 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.data.convert;

import java.text.ParseException;

/**
 * Converts the display value to a double and vice versa.
 */
public class DefaultDoubleDisplayConverter extends
        DecimalNumericDisplayConverter {

    @Override
    protected Object convertToNumericValue(String value) {
        try {
            return this.nf.parse(value).doubleValue();
        } catch (ParseException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

}
