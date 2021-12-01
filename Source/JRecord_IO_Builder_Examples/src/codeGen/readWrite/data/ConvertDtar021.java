package codeGen.readWrite.data;

 /*
  * *------------- Keep this notice in your final code ---------------
  * *   This code was generated by JRecord projects CodeGen program
  * *            on the: 26 Nov 2017 8:20:4 
  * *     from Copybook: DTAR021.cbl
  * *          Template: pojo
  * *             Split: None   
  * * File Organization: FixedWidth   
  * *              Font: cp037
  * *   
  * *    CodeGen Author: Bruce Martin
  * *-----------------------------------------------------------------
  *
  *   This Code should not be changed you should, either:
  *   * Rerun CodeGen to regenerate it 
  *   * Fix CodeGen and rerun CodeGen
  *
  *   Please supply any program fixes/enhancements/documentation
  *   back to the JRecord project (https://sourceforge.net/projects/jrecord/)
  *   so other people can benefit !!!
  * 
  *
  *          Bruce Martin (JRecord / CodeGen Author) 
  *
  * ------------------------------------------------------------------
  * v01  CodeGen        26 Nov 2017  Initial version
  *     (Bruce Martin)
  */

import java.io.IOException;


import net.sf.JRecord.cgen.impl.BasePojoConverter;
import net.sf.JRecord.def.IO.builders.ISchemaIOBuilder;

import net.sf.JRecord.Common.IFieldDetail;

import net.sf.JRecord.Details.AbstractLine;
import net.sf.JRecord.Details.LayoutDetail;
import net.sf.JRecord.Details.Line;
import net.sf.JRecord.Details.fieldValue.IFieldValueUpdLine;
import net.sf.JRecord.Details.fieldValue.LineFieldCreator;

public class ConvertDtar021 extends BasePojoConverter<LineDtar021Pojo> {
 
    public final IFieldValueUpdLine fuKeycodeNo;
    public final IFieldValueUpdLine fuStoreNo;
    public final IFieldValueUpdLine fuTheDate;
    public final IFieldValueUpdLine fuDeptNo;
    public final IFieldValueUpdLine fuQtySold;
    public final IFieldValueUpdLine fuSalePrice;

                  
    public ConvertDtar021(ISchemaIOBuilder lineCreator) throws IOException {
        super(lineCreator);
        
        LayoutDetail schema = lineCreator.getLayout();
        FieldNamesDtar021.RecordDtar021 fn
                   = FieldNamesDtar021.RECORD_DTAR021;
        Line line = null;
        LineFieldCreator lfc = LineFieldCreator.getInstance();
                  
                   
        IFieldDetail fldKeycodeNo = schema.getFieldFromName(fn.keycodeNo);
        IFieldDetail fldStoreNo = schema.getFieldFromName(fn.storeNo);
        IFieldDetail fldTheDate = schema.getFieldFromName(fn.theDate);
        IFieldDetail fldDeptNo = schema.getFieldFromName(fn.deptNo);
        IFieldDetail fldQtySold = schema.getFieldFromName(fn.qtySold);
        IFieldDetail fldSalePrice = schema.getFieldFromName(fn.salePrice);

        fuKeycodeNo = lfc.newFieldValue(line, fldKeycodeNo);
        fuStoreNo = lfc.newFieldValue(line, fldStoreNo);
        fuTheDate = lfc.newFieldValue(line, fldTheDate);
        fuDeptNo = lfc.newFieldValue(line, fldDeptNo);
        fuQtySold = lfc.newFieldValue(line, fldQtySold);
        fuSalePrice = lfc.newFieldValue(line, fldSalePrice);


    }

    @Override
    public LineDtar021Pojo toPojo(AbstractLine line) { 
        
        LineDtar021Pojo pojo = new LineDtar021Pojo();
        
        pojo.setKeycodeNo(fuKeycodeNo.setLine(line).asString());   
	// true

       if (line instanceof Line) {
           Line l = (Line) line;
        
           pojo.setStoreNo( (short) fuStoreNo.setLine(l).asInt());   
           pojo.setTheDate(fuTheDate.setLine(l).asInt());   
           pojo.setDeptNo( (short) fuDeptNo.setLine(l).asInt());   
           pojo.setQtySold(fuQtySold.setLine(l).asInt());   
           pojo.setSalePrice(fuSalePrice.setLine(l).asBigDecimal());   
       } else {
           FieldNamesDtar021.RecordDtar021 fn
                   = FieldNamesDtar021.RECORD_DTAR021;

           pojo.setStoreNo( (short) line.getFieldValue(fn.storeNo).asInt());   
           pojo.setTheDate(line.getFieldValue(fn.theDate).asInt());   
           pojo.setDeptNo( (short) line.getFieldValue(fn.deptNo).asInt());   
           pojo.setQtySold(line.getFieldValue(fn.qtySold).asInt());   
           pojo.setSalePrice(line.getFieldValue(fn.salePrice).asBigDecimal());   
       }
                        

        return pojo;
    }

    @Override
    public void updateLine(AbstractLine line, LineDtar021Pojo pojo) {
        
       fuKeycodeNo.setLine(line).set(pojo.getKeycodeNo());
       if (line instanceof Line) {
           Line l = (Line) line;

           fuStoreNo.setLine(l).set(pojo.getStoreNo());
           fuTheDate.setLine(l).set(pojo.getTheDate());
           fuDeptNo.setLine(l).set(pojo.getDeptNo());
           fuQtySold.setLine(l).set(pojo.getQtySold());
           fuSalePrice.setLine(l).set(pojo.getSalePrice());
       } else {
           FieldNamesDtar021.RecordDtar021 fn
                   = FieldNamesDtar021.RECORD_DTAR021;

	       line.getFieldValue(fn.storeNo).set(pojo.getStoreNo());
	       line.getFieldValue(fn.theDate).set(pojo.getTheDate());
	       line.getFieldValue(fn.deptNo).set(pojo.getDeptNo());
	       line.getFieldValue(fn.qtySold).set(pojo.getQtySold());
	       line.getFieldValue(fn.salePrice).set(pojo.getSalePrice());
       }
    
    }
    
}
