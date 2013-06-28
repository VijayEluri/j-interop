/**
* Donated by Jarapac (http://jarapac.sourceforge.net/) and released under EPL.
* 
* j-Interop (Pure Java implementation of DCOM protocol)
*     
* Copyright (c) 2013 Vikram Roopchand
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Vikram Roopchand  - Moving to EPL from LGPL v1.
*  
*/


package rpc;


public class IntegrityException extends RpcException {

    /**
	 *
	 */
	private static final long serialVersionUID = 6809424276771390469L;

	public IntegrityException() {
        super();
    }

    public IntegrityException(String message) {
        super(message);
    }

}
