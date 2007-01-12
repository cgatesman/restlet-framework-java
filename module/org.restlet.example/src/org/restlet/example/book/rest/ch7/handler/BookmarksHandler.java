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

package org.restlet.example.book.rest.ch7.handler;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.Request;
import org.restlet.data.Response;
import org.restlet.example.book.rest.ch7.Application;
import org.restlet.example.book.rest.ch7.resource.BookmarksResource;
import org.restlet.resource.Resource;

/**
 * Handler of bookmarks list resources.
 * 
 * @author Jerome Louvel (contact@noelios.com)
 */
public class BookmarksHandler extends ApplicationHandler {

    public BookmarksHandler(Application application) {
        super(application);
    }

    @Override
    public Resource findTarget(final Request request, Response response) {
        String userName = (String) request.getAttributes().get("username");
        ChallengeResponse cr = request.getChallengeResponse();
        String login = (cr != null) ? cr.getIdentifier() : null;
        String password = (cr != null) ? cr.getSecret() : null;
        return new BookmarksResource(getApplication(), userName, login, password);
    }
}
