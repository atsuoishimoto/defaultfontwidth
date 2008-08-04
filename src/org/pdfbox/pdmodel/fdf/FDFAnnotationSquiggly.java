/**
 * Copyright (c) 2007, www.pdfbox.org
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 3. Neither the name of pdfbox; nor the names of its
 *    contributors may be used to endorse or promote products derived from this
 *    software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * http://www.pdfbox.org
 *
 */
package org.pdfbox.pdmodel.fdf;

import java.io.IOException;

import org.pdfbox.cos.COSDictionary;
import org.pdfbox.cos.COSName;
import org.w3c.dom.Element;

/**
 * This represents a Squiggly FDF annotation.
 *
 * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 * @version $Revision: 1.1 $
 */
public class FDFAnnotationSquiggly extends FDFAnnotation
{
    /**
     * COS Model value for SubType entry.
     */
    public static final String SUBTYPE ="Squiggly";
    
    /**
     * Default constructor.
     */
    public FDFAnnotationSquiggly()
    {
        super();
        annot.setName( COSName.SUBTYPE, SUBTYPE );
    }
 
    /**
     * Constructor
     * 
     * @param a An existing FDF Annotation.
     */
    public FDFAnnotationSquiggly( COSDictionary a )
    {
        super( a );
    }
    
    /**
     * Constructor.
     * 
     *  @param element An XFDF element.
     *  
     *  @throws IOException If there is an error extracting information from the element.
     */
    public FDFAnnotationSquiggly( Element element ) throws IOException
    {
        super( element );
        annot.setName( COSName.SUBTYPE, SUBTYPE );
    }
}