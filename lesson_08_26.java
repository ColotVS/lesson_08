public class lesson_08_26 {
    //Правильно унаследуй классы:

    //Человека — от существа;
    //Java-девелопера — от человека.
    //Удали дублирующие методы.
}

class Man extends Entity{
    public void speak(){
        System.out.println("Я умею общаться.");
    }
}

class Entity{
    public void move(){
        System.out.println("Я передвигаюсь.");
    }

    public void eat(){
        System.out.println("Я ем.");
    }
}

class JavaDeveloper extends Man{
    public void code(){
        System.out.println("Я умею общаться на Java.");
    }
}
