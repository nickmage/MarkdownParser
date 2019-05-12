class LinkProcessor extends Processor{
    @Override
    String process(String line) {
        StringBuilder builder = new StringBuilder();
        while (line.contains("](")) {
            builder.append("<a href=\"").append(line, line.indexOf('(') + 1, line.indexOf(')'))
                    .append("\">").append(line, line.indexOf('[') + 1, line.indexOf(']')).append("</a>");
            if (line.indexOf(')') != line.length() - 1) {
                line = line.substring(0, line.indexOf('[')) + builder.toString() + line.substring(line.indexOf(')') + 1);
            } else {
                line = line.substring(0, line.indexOf('[')) + builder.toString();
            }
        }
        return line;
    }
}
