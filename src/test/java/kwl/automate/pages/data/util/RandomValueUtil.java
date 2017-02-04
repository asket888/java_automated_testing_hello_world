package kwl.automate.pages.data.util;

public class RandomValueUtil {

    MathRandomUtil mathRandom = new MathRandomUtil();

    // random last name value
//    private int lastNameVar = mathRandom.getMathRandom(49, 0);
    private String[] lastNameList = {"Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Лебедев", "Козлов",
            "Новиков", "Морозов", "Петров", "Волков", "Соловьёв", "Васильев", "Зайцев", "Павлов", "Семёнов", "Голубев",
            "Виноградов", "Богданов", "Воробьёв", "Фёдоров", "Михайлов", "Беляев", "Тарасов", "Белов", "Комаров",
            "Орлов", "Киселёв", "Макаров", "Андреев", "Ковалёв", "Ильин", "Гусев", "Титов", "Кузьмин", "Кудрявцев",
            "Баранов", "Куликов", "Алексеев", "Степанов", "Яковлев", "Сорокин", "Сергеев", "Романов", "Захаров",
            "Борисов", "Королёв", "Герасимов", "Пономарёв", "Григорьев"};
    public String getLastName() {return lastNameList[mathRandom.getMathRandom(49, 0)];}

    // random first name value
    private String[] firstNameList =  {"Андрей", "Алексей", "Александр", "Артем", "Анатолий", "Борис", "Вадим",
            "Валенин", "Василий", "Виктор", "Григорий", "Денис", "Дмитрий", "Евгений", "Егор", "Иван", "Игорь",
            "Константин", "Леонид", "Марк", "Максим", "Никита", "Николай", "Олег", "Пантелеймон", "Павел", "Роман",
            "Руслан", "Святослав", "Сергей", "Семен", "Станислав", "Степан", "Тимофей", "Трофим", "Федор", "Фома",
            "Юрий", "Ярослав", "Ян"};
    public String getFirstName() {return firstNameList[mathRandom.getMathRandom(39, 0)];}

    // random second name value
    private String[] secondNameList = {"Андреевич", "Алексеевич", "Александрович", "Артемович", "Анатольевич",
            "Борисович", "Вадимович", "Валенинович", "Васильевич", "Викторович", "Григорьевич", "Денисович",
            "Дмитриевич", "Евгеньевич", "Егорович", "Иванович", "Игоревич", "Константинович", "Леонидович", "Маркович",
            "Максимович", "Никитович", "Николаевич", "Олегович", "Пантелеймонович", "Павлович", "Романович",
            "Русланович", "Святославович", "Сергеевич", "Семенович", "Станиславович", "Степанович", "Тимофеевич",
            "Трофимович", "Федорович", "Фомич", "Юриьевич", "Ярославович", "Янович"};
    public String getSecondName() {return secondNameList[mathRandom.getMathRandom(39, 0)];}

    // random date value
    private int dd1 = mathRandom.getMathRandom(28, 1);
    private String dd = (dd1 < 10 ? "0" : "") + dd1;
    private int mm1 = mathRandom.getMathRandom(12, 1);
    private String mm = (mm1 < 10 ? "0" : "") + mm1;
    private int yyyy = mathRandom.getMathRandom(2016, 1900);
    public String getRandomDate() {return dd+"."+mm+"."+yyyy+"\n";}

    // random passport number variable
    public String getPersonalNumber() {return "" + mathRandom.getMathRandom(9999999, 1000000) + "A" +
            mathRandom.getMathRandom(999, 100) + "AA" + mathRandom.getMathRandom(9, 1);}

    // random phone number variable
    public String getPhoneNumber() {return ("+375(29)" + mathRandom.getMathRandom(9999999, 1000000) + "\n"
            + "8 (044) " + mathRandom.getMathRandom(9999999, 1000000));}

    // random blood group value
    private String[] bloodGroupList = {"O (I)", "A (II)", "B (III)", "AB (IV)"};
    public String getBloodGroup() {return bloodGroupList[mathRandom.getMathRandom(3, 0)];}

    // random Rh factor value
    private String[] bloodRhesusList = {"Positive", "Negative"};
    public String getBloodRhesus() {return bloodRhesusList[mathRandom.getMathRandom(1, 0)];}

    // random HLA value
    public String getHla() {return String.valueOf(mathRandom.getMathRandom(99, 1));}

    // text fields filling
    public String getText() {return "ЙЦУКЕН йцукен QWERTY qwerty 1234567890 !@#$%^&*()[]{} 安德魯是個大好人";}
}
