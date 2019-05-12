public class Main {
    public static void main(String[] args) {
        Markdown markdown = new Markdown();
        String a = "##Header line\n" +
                "Simple line *with* em\n" +
                "Simple **line** with **strong**\n" +
                "Line with link [Link to google](https://www.google.com) in center\n" +
                "Line **with** *many* **elements** and link [Link to FB](https://www.facebook.com)";
        markdown.setSource(a);
        System.out.println(markdown.getSource());
    }
}