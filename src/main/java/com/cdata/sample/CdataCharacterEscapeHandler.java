package com.cdata.sample;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class CdataCharacterEscapeHandler implements CharacterEscapeHandler {

    @Override
    public void escape(char[] buf, int start, int length, boolean isAttVal, Writer out)
            throws IOException {
        StringWriter buffer = new StringWriter();
        for (int i = start; i < start + length; i++) {
            buffer.write(buf[i]);
        }

        String line = buffer.toString();
        if (!(line.matches("^<!\\[CDATA\\[(.|[\\n\\r\\u2028\\u2029\\u0085])*\\]\\]>$"))) {
            line = line.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("'", "&apos;")
                    .replace("\"", "&quot;");

        }

        System.out.println(line);

        out.write(line);
    }
}
