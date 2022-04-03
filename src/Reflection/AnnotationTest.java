package Reflection;

public class AnnotationTest {

    public static void main(String[] args) {
        ContainerService containerService = new ContainerService();

        ArticleController articleController = containerService.getObject(ArticleController.class);

        articleController.foo();
    }
}
