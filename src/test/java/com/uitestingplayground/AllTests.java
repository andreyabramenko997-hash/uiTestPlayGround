package com.uitestingplayground;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Запускаем все тесты по алфавиту")
@SelectClasses ({
        AJAXData.class,
        Alerts.class,
        AnimatedButton.class,
        AutoWait.class,
        ClassAttribute.class,
        Click.class,
        ClientSideDelay.class,
        DisabledInput.class,
        DynamicId.class,
        FileUpload.class,
        HiddenLayers.class,
        MouseOver.class,
        NonBreakingSpace.class,
        OverlappedElement.class,
        ProgressBar.class,
        SampleApp.class,
        Scrollbars.class,
        ShadowDOM.class,
        TextInput.class,
        VerifyText.class,
        Visibility.class
})
public class AllTests {
}
