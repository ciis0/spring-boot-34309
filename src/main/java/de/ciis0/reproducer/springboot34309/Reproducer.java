package de.ciis0.reproducer.springboot34309;

public class Reproducer {

    /**
     * field with setter only
     */
    private String fieldWithSetterOnly;
    /**
     * field with setter and getter
     */
    private String fieldWithSetterAndGetter;

    public void setFieldWithSetterOnly(String fieldWithSetterOnly) {
        this.fieldWithSetterOnly = fieldWithSetterOnly;
    }

    public String getFieldWithSetterAndGetter() {
        return fieldWithSetterAndGetter;
    }

    public void setFieldWithSetterAndGetter(String fieldWithSetterAndGetter) {
        this.fieldWithSetterAndGetter = fieldWithSetterAndGetter;
    }

    @Override
    public String toString() {
        return "Reproducer{" +
                "fieldWithSetterOnly='" + fieldWithSetterOnly + '\'' +
                ", fieldWithSetterAndGetter='" + fieldWithSetterAndGetter + '\'' +
                '}';
    }
}
