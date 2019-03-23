set PATH_TO_FX="C:\Program Files\Java\javafx-sdk-11.0.2\lib"

COMPILE
javac --module-path %PATH_TO_FX% --add-modules=javafx.controls HelloFX.java


javac --module-path %PATH_TO_FX% --add-modules=javafx.controls --add-modules=javafx.fxml *.java

RUN
java --module-path %PATH_TO_FX% --add-modules=javafx.controls --add-modules=javafx.fxml 

