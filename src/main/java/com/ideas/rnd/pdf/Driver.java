package com.ideas.rnd.pdf;

public class Driver {

	public static void main(String[] args) throws Exception {
		ReportPdf reportPdf = new ReportPdfImpl();
		reportPdf.export("result.pdf");
	}

    /*// Page configuration
    private static final PDRectangle PAGE_SIZE = PDRectangle.A4;
    private static final float MARGIN = 36;
    private static final boolean IS_LANDSCAPE = true;
    // Font configuration
    private static final PDFont HEADER_TEXT_FONT = PDType1Font.HELVETICA_BOLD_OBLIQUE;
    private static final float HEADER_FONT_SIZE = 6;
    private static final Color HEADER_TEXT_COLOR = Color.WHITE;
    private static final Color HEADER_BACKGROUND_COLOR = new Color(2, 43, 87);

    private static final PDFont CONTENT_TEXT_FONT = PDType1Font.HELVETICA;
    private static final float CONTENT_FONT_SIZE = 5;
    private static final Color CONTENT_TEXT_COLOR = Color.BLACK;

    // Table configuration
    private static final float ROW_HEIGHT = 10;
    private static final float CELL_PADDING = 2;
    private static final float COLUMN_HEIGHT = ROW_HEIGHT * 3;

    public static void main(String[] args) throws IOException {
        Header headerData = getHeader();
        Table table = createContent();
        Graph graph = getGraph();
        Footer footer = getFooterConfiguration();
        PdfReportGenerator pdfReportGenerator = new PdfReportGenerator("results.pdf", headerData, footer, table, graph);
        pdfReportGenerator.generatePDF();
    }

    private static Graph getGraph() {
        URL resource1 = Driver.class.getClassLoader().getResource("images/graph1.jpg");
        URL resource2 = Driver.class.getClassLoader().getResource("images/graph2.png");
        List<File> graphs = new ArrayList<>();
        assert resource1 != null;
        graphs.add(new File(resource1.getPath()));
        assert resource2 != null;
        graphs.add(new File(resource2.getPath()));
        return new Graph(graphs);
    }

    private static Footer getFooterConfiguration() {
        URL resource = Driver.class.getClassLoader().getResource("images/logo.png");
        assert resource != null;
        return Footer.builder()
                .lineColor(Color.lightGray)
                .lineWidth(0.6f)
                .pageNumberPhrase("Page %s of %s")
                .pageNumberPhraseColor(Color.BLACK)
                .pageNumberPhraseFont(PDType1Font.TIMES_BOLD)
                .pageNumberPhraseSize(8)
                .logoImage(new File(resource.getPath()))
                .build();
    }

    private static Header getHeader() {
        return Header.builder()
                .propertyName("Moevenpick Amsterdam")
                .propertyNameColor(Color.black)
                .propertyNameFont(PDType1Font.COURIER_BOLD)
                .propertyNameFontSize(13)
                .reportName("Last Room Value report")
                .reportNameColor(Color.black)
                .reportNameFont(PDType1Font.COURIER)
                .reportNameFontSize(11)
                .metaKeyVal(getHeaderMap())
                .metaKeyValColor(Color.black)
                .metaKeyValFont(PDType1Font.TIMES_ROMAN)
                .metaKeyValFontSize(5)
                .build();
    }

    private static Map<String, Object> getHeaderMap() {
        Map<String, Object> headerMap = new LinkedHashMap<>();
        headerMap.put("Printed By:", "ideas_adm");
        headerMap.put("Print Date: ", "Fri 02-Nov-2018 15:00");
        headerMap.put("Start Date:", "Sun 29-Jun-2014");
        headerMap.put("End Date:", "Tue 29-Jun-2014");
        headerMap.put("Legend:", "(*) Indicates an active Hotel Forecast Override on this date");
        headerMap.put("Legend:1", "(*) Indicates an active Hotel Forecast Override on this date");
        headerMap.put("Legend:2", "(*) Indicates an active Hotel Forecast Override on this date");

        return headerMap;
    }

    private static Table createContent() {
        List<Column> columns = getColumns();
        List<Range> fixedColumns = geFixedColumnRanges();
        List<List<String>> content = getContent();
        double totalRowWidth = columns.stream().mapToDouble(Column::getWidth).sum();
        return getTable(columns, fixedColumns, content, (float) totalRowWidth);
    }

    private static Table getTable(List<Column> columns, List<Range> fixedColumns, List<List<String>> content, float totalRowWidth) {
        return Table.builder()
                .cellPadding(CELL_PADDING)
                .columns(columns)
                .columnHeight(COLUMN_HEIGHT)
                .fixedColumns(fixedColumns)
                .content(content)
                .rowWidth(totalRowWidth)
                .numberOfRows(content.size())
                .rowHeight(ROW_HEIGHT)
                .margin(MARGIN)
                .pageSize(PAGE_SIZE)
                .isLandscape(IS_LANDSCAPE)
                .lineColor(Color.LIGHT_GRAY)
                .lineWidth(0.5f)
                .headerTextFont(HEADER_TEXT_FONT)
                .headerFontSize(HEADER_FONT_SIZE)
                .headerBackgroundColor(HEADER_BACKGROUND_COLOR)
                .headerTextColor(HEADER_TEXT_COLOR)
                .contentTextFont(CONTENT_TEXT_FONT)
                .contentFontSize(CONTENT_FONT_SIZE)
                .contentTextColor(CONTENT_TEXT_COLOR)
                .build();
    }

    private static List<List<String>> getContent() {
        String[] arr = {"FirstName", "LastName", "fakemail@mock.com", "12345", "yes", "XH4234FSD", "4334", "yFone 5 XS", "31/05/2013 07:15 am", "WEB"};
        List<List<String>> rows = new ArrayList<>();
        for (int row = 0; row < 100; row++) {
            List<String> modifiableList = new ArrayList(Arrays.asList(arr));
            rows.add(modifiableList);
        }
        return rows;
    }

    private static List<Range> geFixedColumnRanges() {
        List<Range> fixedColumns = new ArrayList<>();
        Range range = new Range();
        range.setFrom(0);
        range.setTo(1);
        fixedColumns.add(range);
        return fixedColumns;
    }

    private static List<Column> getColumns() {
        List<Column> columns = new ArrayList<>();
        columns.add(Column.builder().name("FirstName FirstName,FirstName").width(50).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("LastName").width(50).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("Email").width(150).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("ZipCode").width(43).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("MailOptIn").width(50).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("Code").width(80).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("Branch").width(50).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("Product").width(80).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("Date").width(120).alignment(Alignment.CENTER).build());
        columns.add(Column.builder().name("Channel").width(43).alignment(Alignment.CENTER).build());
        return columns;
    }*/
}