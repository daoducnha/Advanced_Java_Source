package bigexercise1daoducnha;



/**
 * @author hv
 * @version 1.0
 * @created 06-Sep-2016 11:09:05 AM
 */
public class MarkTable {

	public String className;
	public DetailMarkTable[] detailMarkTable;
	public Class m_Class;
        public Subject subject;

	public MarkTable(){

	}

    public MarkTable(String className, DetailMarkTable[] detailMarkTable, Class m_Class) {
        this.className = className;
        this.detailMarkTable = detailMarkTable;
        this.m_Class = m_Class;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public DetailMarkTable[] getDetailMarkTable() {
        return detailMarkTable;
    }

    public void setDetailMarkTable(DetailMarkTable[] detailMarkTable) {
        this.detailMarkTable = detailMarkTable;
    }

    public Class getM_Class() {
        return m_Class;
    }

    public void setM_Class(Class m_Class) {
        this.m_Class = m_Class;
    }

    public void showMarkStudent(){
        for (DetailMarkTable values : detailMarkTable) {
            if(values!=null)
                System.out.println("Name: "+values.getStudent().getName()+" Mark: "+ values.mark.calMarkFinal()+ " Subject: "+values.subject.getSubjectName());
        }
    }
}