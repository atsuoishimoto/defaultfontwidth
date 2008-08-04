/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pdfbox.util.operator;

import java.util.List;

import org.pdfbox.cos.COSNumber;
import org.pdfbox.pdmodel.graphics.color.PDColorSpace;
import org.pdfbox.pdmodel.graphics.color.PDColorSpaceInstance;
import org.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import org.pdfbox.util.PDFOperator;

import java.io.IOException;

/**
 * <p>Set the non stroking color space.</p>
 * 
 * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 * @version $Revision: 1.1 $
 */
public class SetNonStrokingGrayColor extends OperatorProcessor 
{
    /**
     * rg Set color space for non stroking operations.
     * @param operator The operator that is being executed.
     * @param arguments List
     * @throws IOException If an error occurs while processing the font.
     */
    public void process(PDFOperator operator, List arguments) throws IOException
    {
        PDColorSpace cs = new PDDeviceGray();
        PDColorSpaceInstance colorInstance = context.getGraphicsState().getNonStrokingColorSpace();
        colorInstance.setColorSpace( cs );
        float[] values = new float[1];
        if( arguments.size() >= 1 ) 
        {
            values[0] = ((COSNumber)arguments.get( 0 )).floatValue();
        }
        else
        {
            throw new IOException( "Error: Expected at least one argument when setting non stroking gray color");
        }
        colorInstance.setColorSpaceValue( values );
    }
}