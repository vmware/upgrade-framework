/* ****************************************************************************
 * Copyright (c) 2012-2014 VMware, Inc. All Rights Reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 * ****************************************************************************/

package com.vmware.upgrade.sql;

/**
 * This object is used to construct a raw SQL string.
 * <p>
 * The exact string that is returned is dependent on the {@link DatabaseType}
 *
 * @author Ryan Lewis ryanlewis@vmware.com
 * @version 1.0
 * @since 1.0
 */
public interface SQLStatement {
    /**
     * Get the appropriate SQL string for a given {@link DatabaseType}.
     *
     * @param databaseType {@link DatabaseType}
     * @return an SQL string
     * @throws IllegalArgumentException if a statement cannot be retrieved for
     *         the given {@code databaseType}
     */
    public String get(final DatabaseType databaseType);
}
