package by.bsu.practice.jdbc;

import by.bsu.practice.jdbc.exception.InvalidDataException;
import by.bsu.practice.jdbc.service.OperationsSelect;
import by.bsu.practice.jdbc.service.OperationsUpdate;

public class Runner {

    public static void main(String... args) throws InvalidDataException {

        OperationsSelect.fullPathCatalog("Photos");
        OperationsSelect.fullPathFile("TenLab");
        OperationsSelect.countFiles("C");
        OperationsSelect.countSizeCatalog("Videos");
        OperationsSelect.findFileByMask("Photo*");
        OperationsUpdate.changeFileCatalog("Video3","FunnyVideos");
        OperationsUpdate.deleteFiles("Movies");
    }

}
