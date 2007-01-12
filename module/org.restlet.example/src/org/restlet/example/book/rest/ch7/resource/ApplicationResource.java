/*
 * Copyright 2005-2007 Noelios Consulting.
 * 
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the "License"). You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at
 * http://www.opensource.org/licenses/cddl1.txt See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL HEADER in each file and
 * include the License file at http://www.opensource.org/licenses/cddl1.txt If
 * applicable, add the following below this CDDL HEADER, with the fields
 * enclosed by brackets "[]" replaced with your own identifying information:
 * Portions Copyright [yyyy] [name of copyright owner]
 */

package org.restlet.example.book.rest.ch7.resource;

import org.restlet.example.book.rest.ch7.Application;
import org.restlet.resource.Resource;

import com.db4o.ObjectContainer;

/**
 * @author Jerome Louvel (contact@noelios.com)
 */
public class ApplicationResource extends Resource {

    private Application application;

    public ApplicationResource(Application application) {
        this.application = application;
    }

    /**
     * Returns the parent application.
     * 
     * @return the parent application.
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * Returns the database container.
     * 
     * @return the database container.
     */
    public ObjectContainer getContainer() {
        return getApplication().getContainer();
    }

}
