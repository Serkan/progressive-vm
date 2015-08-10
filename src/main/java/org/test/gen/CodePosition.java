package org.test.gen;

public class CodePosition {

        private int startIndex;

        private int stopIndex;

        private String line;

        public CodePosition(int startIndex, int stopIndex, String line) {
            this.startIndex = startIndex;
            this.stopIndex = stopIndex;
            this.line = line;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public int getStopIndex() {
            return stopIndex;
        }

        public String getLine() {
            return line;
        }
    }