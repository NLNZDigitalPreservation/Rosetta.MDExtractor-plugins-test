package com.exlibris.rosetta.repository.plugin.mdExtractor.epub;

import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractJhoveMDExtractorPlugin;
import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractNLNZMDExtractorPluginTest;
import org.junit.Before;
import org.junit.Test;

public class EPUBPTCMDExtractorPluginTest extends AbstractNLNZMDExtractorPluginTest {
    private AbstractJhoveMDExtractorPlugin instance;

    @Before
    public void initTest() {
        instance = new EPUBPTCMDExtractorPlugin();
    }

    @Test
    public void test() throws Exception {
        testExtract();
        testGetSupportedAttributeNames();
        testGetAgent();
        System.out.println("Finished");
    }

    public void testGetAgent() throws Exception {
        super.testGetAgent(instance, "JHOVE 1.24.2, EPUB-ptc 1.0 , Plugin Version null");
    }

    public void testGetSupportedAttributeNames() throws Exception {
        super.testGetSupportedAttributeNames(instance);
    }

    public void testExtract() throws Exception {
        /*
         * Not implemented properly. Do it when time permits.
         */
        super.testExtract(instance, "epub3-valid-multimedia.epub");
    }

    @Override
    protected String getExpectedFileFormatName() {
        return "EPUB";
    }

    protected void prepareExpectedValues() {
        prepareExpectedValues("EPUBMetadata.PageCount",IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.CharacterCount", "43476");
        prepareExpectedValues("EPUBMetadata.Language", "jp");

        prepareExpectedValues("EPUBMetadata.Info.Identifier", "com.github.epub-testsuite.epub30-test-0100");
        prepareExpectedValues("EPUBMetadata.Info.Title", "EPUBTEST 0100 - Reflowable Content Tests");
        prepareExpectedValues("EPUBMetadata.Info.Creator", "[Marisa DeMeglio, Markus Gylling, Matt Garrish, Ori Idan, Toshiaki Koike, Vincent Gros]");
        prepareExpectedValues("EPUBMetadata.Info.Contributor", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.Info.Date", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.Info.Publisher", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.Info.Subject", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.Info.Rights", "Copyright © 2012-2015 International Digital Publishing Forum (IDPF)");

        prepareExpectedValues("EPUBMetadata.Fonts.Fonts.FontName", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.Fonts.Fonts.FontFile", IGNORE_COMPARISON);

        prepareExpectedValues("EPUBMetadata.MediaTypes", "[application/ttml+xml, application/x-demo-slideshow, application/xhtml+xml, audio/mp4, audio/mpeg, image/gif, image/jpeg, image/png, image/svg+xml, image/xyz, text/css, text/vtt, video/mp4, video/webm]");
        prepareExpectedValues("EPUBMetadata.References", "[http://epubtest.org/media/remote/allison64-remote.mp3, http://epubtest.org/media/remote/allison64-remote.mp4, http://idpf.org/, http://idpf.org/epub/30/spec/epub30-contentdocs.html#sec-xhtml-content-switch, http://idpf.org/epub/30/spec/epub30-contentdocs.html#sec-xhtml-epub-case, http://www.epubtest.org, https://github.com/IDPF/epub-testsuite, https://github.com/mgylling/epub-testsuite/wiki/Overview]");
        prepareExpectedValues("EPUBMetadata.Resources", "[EPUB/audio/allison64.mp3, EPUB/audio/allison64.mp4, EPUB/bindings/slideshow.xml, EPUB/css/base.css, EPUB/css/math.css, EPUB/css/svg.css, EPUB/img/Skype_logo.png, EPUB/img/check.gif, EPUB/img/check.jpg, EPUB/img/check.png, EPUB/img/circle.jpg, EPUB/img/mathml-01-010-basic_rendering.png, EPUB/img/mathml-01-020-styling.png, EPUB/img/mathml-01-030-surds.png, EPUB/img/mathml-01-040-vertical_stretch.png, EPUB/img/mathml-01-050-horizontal_stretch.png, EPUB/img/mathml-01-060-mtable_1.png, EPUB/img/mathml-01-061-mtable_2.png, EPUB/img/mathml-01-070-bidi_arabic.png, EPUB/img/mathml-01-080-mlongdiv.png, EPUB/img/mathml-01-081-mstack.png, EPUB/img/mathml-01-090-mmultiscripts.png, EPUB/img/nonimage.xyz, EPUB/svg/circle.svg, EPUB/svg/content-svg-001.svg, EPUB/video/screencast.mp4, EPUB/video/screencast.webm, EPUB/video/tracks/screencast.ttml, EPUB/video/tracks/screencast.vtt, EPUB/xhtml/content-bindings-001.xhtml, EPUB/xhtml/content-fallbacks-001.xhtml, EPUB/xhtml/content-fallbacks.xhtml, EPUB/xhtml/content-images-001.xhtml, EPUB/xhtml/content-mathml-001.xhtml, EPUB/xhtml/content-multimedia-001.xhtml, EPUB/xhtml/content-multimedia-002.xhtml, EPUB/xhtml/content-multimedia-003.xhtml, EPUB/xhtml/content-ns-001.xhtml, EPUB/xhtml/content-svg-001.xhtml, EPUB/xhtml/content-svg-002.xhtml, EPUB/xhtml/content-svg-003.xhtml, EPUB/xhtml/content-svg-004.xhtml, EPUB/xhtml/content-switch-001.xhtml, EPUB/xhtml/content-xhtml-001.xhtml, EPUB/xhtml/content-xhtml-002-inset.xhtml, EPUB/xhtml/content-xhtml-002.xhtml, EPUB/xhtml/front.xhtml, EPUB/xhtml/nav.xhtml, EPUB/xhtml/svg-doc-001.xhtml, http://epubtest.org/media/remote/allison64-remote.mp3, http://epubtest.org/media/remote/allison64-remote.mp4]");
        prepareExpectedValues("EPUBMetadata.hasEncryption", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.hasSignatures", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.hasAudio", "true");
        prepareExpectedValues("EPUBMetadata.hasVideo", "true");
        prepareExpectedValues("EPUBMetadata.hasFixedLayout", IGNORE_COMPARISON);
        prepareExpectedValues("EPUBMetadata.hasScripts", "true");
    }

    @Override
    protected String getExpectedFileFormatVersion() {
        return "3.2";
    }
}
