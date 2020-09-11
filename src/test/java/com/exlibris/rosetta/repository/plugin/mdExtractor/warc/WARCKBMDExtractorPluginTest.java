package com.exlibris.rosetta.repository.plugin.mdExtractor.warc;

import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractJhoveMDExtractorPlugin;
import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractNLNZMDExtractorPluginTest;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class WARCKBMDExtractorPluginTest  extends AbstractNLNZMDExtractorPluginTest {
    private AbstractJhoveMDExtractorPlugin instance;

    @Before
    public void initTest() {
        instance = new WARCKBMDExtractorPlugin();
    }

    @Test
    public void test() throws Exception {
        testExtract();
        testGetSupportedAttributeNames();
        testGetAgent();
        System.out.println("Finished");
    }

    public void testGetAgent() throws Exception {
        super.testGetAgent(instance, "JHOVE 1.24.2, WARC-kb 1.0 , Plugin Version null");
    }

    public void testGetSupportedAttributeNames() throws Exception {
        super.testGetSupportedAttributeNames(instance);
    }

    public void testExtract() throws Exception {
        /*
         * Not implemented properly. Do it when time permits.
         */
        super.testExtract(instance, "NLNZ-20200304052335339-00000-8915~kaiwae-z4~8443.warc");
    }

    @Override
    protected String getExpectedFileFormatName() {
        return "WARC";
    }

    protected void prepareExpectedValues() {
//        prepareExpectedValues("Records.Record.Warc-Date","2020");
        if (expectedValues == null) expectedValues = new HashMap<String, String>();
    }

    @Override
    protected String getExpectedFileFormatVersion() {
        return "1.0";
    }
}
