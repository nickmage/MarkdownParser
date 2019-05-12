class HeaderParagraphProcessor extends Processor {
    @Override
    String process(String line) {
        StringBuilder builder = new StringBuilder();
        builder.append(line);
        if (line.startsWith("###")) {
            return builder.delete(0, 3).insert(0, "<h3>").toString() + "</h3>";
        } else if (line.startsWith("##")) {
            return builder.delete(0, 2).insert(0, "<h2>").toString() + "</h2>";
        } else if (line.startsWith("#")) {
            return builder.delete(0, 1).insert(0, "<h1>").toString() + "</h1>";
        } else {
            return builder.insert(0, "<p>").toString() + "</p>";
        }
    }
}
