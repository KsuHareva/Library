package by.suhareva.model.enums;


public class EnumManager {
    public static ProductAction getKindProductAction(String action) {
        try {
            return ProductAction.valueOf(action.toUpperCase());
        } catch (IllegalArgumentException e) {
            return ProductAction.OTHER;
        }
    }

    public static SortKind getSortKind(String action) {
        try {
            return SortKind.valueOf(action.toUpperCase());
        } catch (IllegalArgumentException e) {
            return SortKind.OTHER;
        }
    }

    public static CatalogsEnum getCatalogKind(String action) {
        try {
            return CatalogsEnum.valueOf(action.toUpperCase());
        } catch (IllegalArgumentException e) {
            return CatalogsEnum.OTHER;
        }
    }


}
