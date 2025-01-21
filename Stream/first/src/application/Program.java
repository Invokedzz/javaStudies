package Stream.first.src.application;

import Stream.first.src.model.services.PatternService;

import Stream.first.src.model.entities.ProductStream;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main (String[] args) {

        runTheProgram();

    }

    private static void runTheProgram () {

        List <ProductStream> list = new ArrayList<>();

        PatternService patternService = new PatternService();

        patternService.scanFile(list);

    }

}
