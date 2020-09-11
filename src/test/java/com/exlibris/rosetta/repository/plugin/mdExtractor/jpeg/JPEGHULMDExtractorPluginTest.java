package com.exlibris.rosetta.repository.plugin.mdExtractor.jpeg;

import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractJhoveMDExtractorPlugin;
import com.exlibris.rosetta.repository.plugin.mdExtractor.base.AbstractNLNZMDExtractorPluginTest;
import org.junit.Before;
import org.junit.Test;

public class JPEGHULMDExtractorPluginTest extends AbstractNLNZMDExtractorPluginTest {
    private AbstractJhoveMDExtractorPlugin instance;

    @Before
    public void initTest() {
        instance = new JPEGHULMDExtractorPlugin();
    }

    @Test
    public void test() throws Exception {
        testExtract();
        testGetSupportedAttributeNames();
        testGetAgent();
        System.out.println("Finished");
    }

    //    @Test
    public void testGetAgent() throws Exception {
//        super.testExtract(new JPEGHULMDExtractorPlugin(), "jpgAdapterTest.jpg");
        super.testGetAgent(instance, "JHOVE 1.24.2, JPEG-hul 1.5.2 , Plugin Version null");
    }

    //    @Test
    public void testGetSupportedAttributeNames() throws Exception {
        super.testGetSupportedAttributeNames(instance);
    }

    //    @Test
    public void testExtract() throws Exception {
        /*
         * Not implemented properly. Do it when time permits.
         */
        super.testExtract(instance, "jpgAdapterTest.jpg");
    }

    @Override
    protected String getExpectedFileFormatName() {
        return "JPEG";
    }

    protected void prepareExpectedValues() {
        prepareExpectedValues("JPEGMetadata.ApplicationSegments", "[APP1, APP2]");
        prepareExpectedValues("JPEGMetadata.Comments", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.CompressionType", "Huffman coding, Baseline DCT");

        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ApertureValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ColorSpace", "sRGB");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ComponentsConfiguration", "[1, 2, 3, 0]");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.CompressedBitsPerPixel", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.CustomRendered", "normal");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.DateTimeOriginal", "2009:07:11 22:06:42");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ExifVersion", "0221");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ExposureBiasValue", "0");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ExposureProgram", "manual");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ExposureTime", "15");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.FileSource", "DSC");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.Flash", "did not fire");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.FlashpixVersion", "0100");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.FNumber", "5.6");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.FocalLength", "68");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.FocalLengthIn35mmFilm", "102");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.FocalPlaneResolutionUnit", "inches");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.LightSource", "unknown");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.MakerNote", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.MaxApertureValue", "4.9");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.MeteringMode", "spot");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.PixelXDimension", "268");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.PixelYDimension", "400");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.Saturation", "normal");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.SceneCaptureType", "standard");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.SceneType", "directly photographed image");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.Sharpness", "soft");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.ShutterSpeedValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.SubjectDistance", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.Exif.SubjectDistanceRange", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.AutoFocus", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.BackLight", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.BitsPerSample", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.Brightness", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ByteOrder", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ChecksumMethod", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ChecksumValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.Class", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ColormapBitCodeValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ColormapBlueValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ColormapGreenValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ColormapRedValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ColormapReference", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ColorSpace", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ColorTemp", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.CompressionLevel", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.CompressionScheme", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.DateTimeCreated", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.DateTimeProcessed", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.DeviceSource", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.DigitalCameraManufacturer", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.DigitalCameraModel", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.DisplayOrientation", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ExposureBias", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ExposureIndex", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ExposureTime", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ExtraSamples", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.FileSize", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.Flash", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.FlashEnergy", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.FlashReturn", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.FNumber", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.FocalLength", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.GrayResponseCurve", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.GrayResponseUnit", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.HostComputer", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ImageData", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ImageIdentifier", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ImageIdentifierLocation", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ImageLength", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ImageProducer", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ImageWidth", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.MeteringMode", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.Methodology", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.MimeType", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.Orientation", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.OS", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.OSVersion", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PerformanceData", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PixelSize", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PlanarConfiguration", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PreferredPresentation", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PrimaryChromaticitiesBlueX", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PrimaryChromaticitiesBlueY", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PrimaryChromaticitiesGreenX", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PrimaryChromaticitiesGreenY", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PrimaryChromaticitiesRedX", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.PrimaryChromaticitiesRedY", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ProcessingActions", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ProcessingAgency", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ProcessingSoftwareName", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ProcessingSoftwareVersion", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ProfileName", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.Profiles", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ProfileURL", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ReferenceBlackWhite", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.RowsPerStrip", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SamplesPerPixel", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SamplingFrequencyPlane", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SamplingFrequencyUnit", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ScannerManufacturer", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ScannerModelName", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ScannerModelNumber", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ScannerModelSerialNo", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ScanningSoftware", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ScanningSoftwareVersionNo", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SceneIlluminant", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SegmentType", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.Sensor", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SourceData", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SourceID", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SourceType", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SourceXDimension", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SourceXDimensionUnit", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SourceYDimension", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SourceYDimensionUnit", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.StripByteCounts", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.StripOffsets", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.SubjectDistance", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TargetIDManufacturer", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TargetIDMedia", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TargetIDName", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TargetIDNo", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TargetType", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TileByteCounts", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TileLength", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TileOffsets", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.TileWidth", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.ViewerData", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.WhitePointXValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.WhitePointYValue", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.XPhysScanResolution", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.XPrintAspectRatio", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.XSamplingFrequency", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.XTargetedDisplayAR", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.YCbCrCoefficients", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.YCbCrPositioning", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.YCbCrSubSampling", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.YPhysScanResolution", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.YPrintAspectRatio", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.YSamplingFrequency", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.NisoImageMetadata.YTargetedDisplayAR", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.PixelAspectRatio.PixelAspectRatioX", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.PixelAspectRatio.PixelAspectRatioY", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.QuantizationTables.QuantizationTable.DestinationIdentifier", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.QuantizationTables.QuantizationTable.Precision", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.RestartInterval", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.Scans", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Number", "<ignore comparison>");
        prepareExpectedValues("JPEGMetadata.Images.Image.XMP", "<ignore comparison>");
    }
}