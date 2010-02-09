/*
  * JBoss, Home of Professional Open Source
  * Copyright 2007, JBoss Inc., and individual contributors as indicated
  * by the @authors tag. See the copyright.txt in the distribution for a
  * full listing of individual contributors.
  *
  * This is free software; you can redistribute it and/or modify it
  * under the terms of the GNU Lesser General Public License as
  * published by the Free Software Foundation; either version 2.1 of
  * the License, or (at your option) any later version.
  *
  * This software is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  * Lesser General Public License for more details.
  *
  * You should have received a copy of the GNU Lesser General Public
  * License along with this software; if not, write to the Free
  * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
  */
package org.jboss.security.identity.fed;

import org.jboss.security.identity.Identity;

/**
 *  Interface for a Kerberos based Identity
 *  @author Anil.Saldhana@redhat.com
 *  @since  Feb 25, 2008 
 *  @version $Revision$
 */
public interface KerberosIdentity<T> extends Identity
{
   /**
    * Return the underlying Kerberos Object
    * @return
    */
   T getKerberosToken();
   
   /**
    * Set the underlying Kerberos Object
    * @param t
    */
   void setKerberosToken(T t); 
}