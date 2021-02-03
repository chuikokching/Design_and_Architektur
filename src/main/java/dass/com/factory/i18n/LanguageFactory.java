package dass.com.factory.i18n;

public class LanguageFactory {
    public static Language getObject(String area){
        Language l = null;
        if(area.equals("Chinese"))
        {
            l=new Chinese();
        }else if(area.equals("Germany"))
        {
            l=new Germany();
        }else if(area.equals("English"))
        {
            l=new English();
        }
        return l;
    }
}
