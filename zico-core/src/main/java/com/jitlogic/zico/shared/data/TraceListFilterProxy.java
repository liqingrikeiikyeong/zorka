/**
 * Copyright 2012-2013 Rafal Lewczuk <rafal.lewczuk@jitlogic.com>
 * <p/>
 * This is free software. You can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * <p/>
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this software. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jitlogic.zico.shared.data;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;
import com.jitlogic.zico.core.model.TraceListFilterExpression;


@ProxyFor(TraceListFilterExpression.class)
public interface TraceListFilterProxy extends ValueProxy {
    String getSortBy();

    void setSortBy(String sortBy);

    boolean isSortAsc();

    void setSortAsc(boolean sortAsc);

    boolean isErrorsOnly();

    void setErrorsOnly(boolean errorsOnly);

    long getMinTime();

    void setMinTime(long minTime);

    int getTraceId();

    void setTraceId(int traceId);

    String getFilterExpr();

    void setFilterExpr(String filterExpr);

    long getTimeStart();

    void setTimeStart(long timeStart);

    long getTimeEnd();

    void setTimeEnd(long timeEnd);
}