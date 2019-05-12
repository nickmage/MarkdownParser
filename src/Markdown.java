class Markdown {
    private String source;

    void setSource(String source) {
        this.source = source;
    }

    String getSource() {
        String[] arrayOfLines = source.split("\n");
        Processor[] processor = {new StrongEmProcessor(), new LinkProcessor(), new HeaderParagraphProcessor()};
        for (int i = 0; i < arrayOfLines.length; i++) {
            for (Processor p : processor) {
                arrayOfLines [i] = p.process(arrayOfLines[i]);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String arrayOfLine : arrayOfLines) {
            builder.append("   ");
            builder.append(arrayOfLine);
            builder.append("\n");
        }
        return "<html>\n" + "<body>\n" + builder.toString() + "</body>\n" + "</html>\n";
    }
}