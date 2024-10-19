package io.muehlbachler.bswe;

import org.springframework.stereotype.Service;

// FIXME: add javadoc
@Service
public class StringService {
    // FIXME: add javadoc
    public String toUpperCase(final String string) {
        return string == null ? null : string.toUpperCase();
    }
}
