/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/compileKotlinAgainstKotlin")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CompileKotlinAgainstKotlinTestGenerated extends AbstractCompileKotlinAgainstKotlinTest {
    public void testAllFilesPresentInCompileKotlinAgainstKotlin() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("annotationInInterface.kt")
    public void testAnnotationInInterface() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/annotationInInterface.kt");
        doTest(fileName);
    }

    @TestMetadata("annotationsOnTypeAliases.kt")
    public void testAnnotationsOnTypeAliases() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/annotationsOnTypeAliases.kt");
        doTest(fileName);
    }

    @TestMetadata("callsToMultifileClassFromOtherPackage.kt")
    public void testCallsToMultifileClassFromOtherPackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/callsToMultifileClassFromOtherPackage.kt");
        doTest(fileName);
    }

    @TestMetadata("classInObject.kt")
    public void testClassInObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/classInObject.kt");
        doTest(fileName);
    }

    @TestMetadata("companionObjectInEnum.kt")
    public void testCompanionObjectInEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/companionObjectInEnum.kt");
        doTest(fileName);
    }

    @TestMetadata("companionObjectMember.kt")
    public void testCompanionObjectMember() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/companionObjectMember.kt");
        doTest(fileName);
    }

    @TestMetadata("constPropertyReferenceFromMultifileClass.kt")
    public void testConstPropertyReferenceFromMultifileClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/constPropertyReferenceFromMultifileClass.kt");
        doTest(fileName);
    }

    @TestMetadata("constructorVararg.kt")
    public void testConstructorVararg() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/constructorVararg.kt");
        doTest(fileName);
    }

    @TestMetadata("copySamOnInline.kt")
    public void testCopySamOnInline() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/copySamOnInline.kt");
        doTest(fileName);
    }

    @TestMetadata("coroutinesBinary.kt")
    public void testCoroutinesBinary() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/coroutinesBinary.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultConstructor.kt")
    public void testDefaultConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/defaultConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultLambdaRegeneration.kt")
    public void testDefaultLambdaRegeneration() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/defaultLambdaRegeneration.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultLambdaRegeneration2.kt")
    public void testDefaultLambdaRegeneration2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/defaultLambdaRegeneration2.kt");
        doTest(fileName);
    }

    @TestMetadata("doublyNestedClass.kt")
    public void testDoublyNestedClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/doublyNestedClass.kt");
        doTest(fileName);
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/enum.kt");
        doTest(fileName);
    }

    @TestMetadata("inlinedConstants.kt")
    public void testInlinedConstants() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/inlinedConstants.kt");
        doTest(fileName);
    }

    @TestMetadata("innerClassConstructor.kt")
    public void testInnerClassConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/innerClassConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmField.kt")
    public void testJvmField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/jvmField.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmFieldInConstructor.kt")
    public void testJvmFieldInConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/jvmFieldInConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmNames.kt")
    public void testJvmNames() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/jvmNames.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmPackageName.kt")
    public void testJvmPackageName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/jvmPackageName.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmPackageNameInRootPackage.kt")
    public void testJvmPackageNameInRootPackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/jvmPackageNameInRootPackage.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmPackageNameWithJvmName.kt")
    public void testJvmPackageNameWithJvmName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/jvmPackageNameWithJvmName.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmStaticInObject.kt")
    public void testJvmStaticInObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/jvmStaticInObject.kt");
        doTest(fileName);
    }

    @TestMetadata("kotlinPropertyAsAnnotationParameter.kt")
    public void testKotlinPropertyAsAnnotationParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/kotlinPropertyAsAnnotationParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14012.kt")
    public void testKt14012() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/kt14012.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14012_multi.kt")
    public void testKt14012_multi() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/kt14012_multi.kt");
        doTest(fileName);
    }

    @TestMetadata("multifileClassInlineFunctionAccessingProperty.kt")
    public void testMultifileClassInlineFunctionAccessingProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/multifileClassInlineFunctionAccessingProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("multifileClassWithTypealias.kt")
    public void testMultifileClassWithTypealias() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/multifileClassWithTypealias.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedClass.kt")
    public void testNestedClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/nestedClass.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedEnum.kt")
    public void testNestedEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/nestedEnum.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedObject.kt")
    public void testNestedObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/nestedObject.kt");
        doTest(fileName);
    }

    @TestMetadata("platformTypes.kt")
    public void testPlatformTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/platformTypes.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyReference.kt")
    public void testPropertyReference() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/propertyReference.kt");
        doTest(fileName);
    }

    @TestMetadata("recursiveGeneric.kt")
    public void testRecursiveGeneric() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/recursiveGeneric.kt");
        doTest(fileName);
    }

    @TestMetadata("sealedClass.kt")
    public void testSealedClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/sealedClass.kt");
        doTest(fileName);
    }

    @TestMetadata("secondaryConstructors.kt")
    public void testSecondaryConstructors() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/secondaryConstructors.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleValAnonymousObject.kt")
    public void testSimpleValAnonymousObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/simpleValAnonymousObject.kt");
        doTest(fileName);
    }

    @TestMetadata("starImportEnum.kt")
    public void testStarImportEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/starImportEnum.kt");
        doTest(fileName);
    }

    @TestMetadata("targetedJvmName.kt")
    public void testTargetedJvmName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/targetedJvmName.kt");
        doTest(fileName);
    }

    @TestMetadata("typeAliasesKt13181.kt")
    public void testTypeAliasesKt13181() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/compileKotlinAgainstKotlin/typeAliasesKt13181.kt");
        doTest(fileName);
    }
}
