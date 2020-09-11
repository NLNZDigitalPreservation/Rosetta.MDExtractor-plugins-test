package com.exlibris.rosetta.repository.plugin.mdExtractor.png;

import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractJhoveMDExtractorPlugin;
import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractNLNZMDExtractorPluginTest;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PNGGDMMDExtractorPluginTest extends AbstractNLNZMDExtractorPluginTest {
    private AbstractJhoveMDExtractorPlugin instance;

    @Before
    public void initTest() {
        instance = new PNGGDMMDExtractorPlugin();
    }

    @Test
    public void test() throws Exception {
        testExtract();
        testGetSupportedAttributeNames();
        testGetAgent();
        System.out.println("Finished");
    }

    public void testGetAgent() throws Exception {
        super.testGetAgent(instance, "JHOVE 1.24.2, PNG-gdm 1.0 , Plugin Version null");
    }

    public void testGetSupportedAttributeNames() throws Exception {
        super.testGetSupportedAttributeNames(instance);
    }

    public void testExtract() throws Exception {
        /*
         * Not implemented properly. Do it when time permits.
         */
        super.testExtract(instance, "expand.png");
    }

    @Override
    protected String getExpectedFileFormatName() {
        return "PNG";
    }

    protected void prepareExpectedValues() {
        prepareExpectedValues("Pixel unit", "Metre");
        prepareExpectedValues("X pixels per unit", "3543");
        prepareExpectedValues("Y pixels per unit", "3543");
        prepareExpectedValues("PNGMetadata.NisoImageMetadata.AutoFocus", null);
        prepareExpectedValues("PNGMetadata.NisoImageMetadata.ImageWidth", "512");
        prepareExpectedValues("PNGMetadata.NisoImageMetadata.ImageLength", "512");
        prepareExpectedValues("PNGMetadata.NisoImageMetadata.BitsPerSample", "[8]"); //
        prepareExpectedValues("PNGMetadata.ColorType", "Truecolour with alpha");
        prepareExpectedValues("PNGMetadata.Compression", "Deflate");
        prepareExpectedValues("PNGMetadata.Filter type", "0");
        prepareExpectedValues("PNGMetadata.Interlace", "None");
        prepareExpectedValues("PNGMetadata.Significant bits", "[8, 8, 8, 8]");
        prepareExpectedValues("PNGMetadata.Keywords.Keyword.Key", "Software");
        prepareExpectedValues("PNGMetadata.Keywords.Keyword.Value", "www.inkscape.org");

        List<String> supportedAttributes = PNGGDMMDExtractorPlugin.getAttributeList();
        for (String attribute : supportedAttributes) {
            if (!expectedValues.containsKey(attribute)) {
                prepareExpectedValues(attribute, IGNORE_COMPARISON);
            }
        }
    }

    @Override
    protected String getExpectedFileFormatVersion() {
        return null;
    }
}
