package dass.com.factory.i18n;

public class Software {

    public static void main(String[] args) {
        Language test= LanguageFactory.getObject("Chinese");
        test.getLanguage();
        Language test1= LanguageFactory.getObject("Germany");
        test1.getLanguage();
        Language test2= LanguageFactory.getObject("English");
        test2.getLanguage();
    }
}
