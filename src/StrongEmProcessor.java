class StrongEmProcessor extends Processor {
    @Override
    String process(String line) {
        boolean needCloseTag = true;
        while (line.contains("**")) {
            if (needCloseTag) {
                line = line.replaceFirst("[*][*]", "<strong>");
                needCloseTag = false;
            } else {
                line = line.replaceFirst("[*][*]", "</strong>");
                needCloseTag = true;
            }
        }
        while (line.contains("*")) {
            if (needCloseTag) {
                line = line.replaceFirst("[*]", "<em>");
                needCloseTag = false;
            } else {
                line = line.replaceFirst("[*]", "</em>");
                needCloseTag = true;
            }
        }
        return line;
    }
}
