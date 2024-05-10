package tests.javafuzzer338;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:11:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=46663L;
    public static double dFld=1.35278;
    public static float fFld=4.835F;
    public static boolean bFld=true;
    public static volatile long lFld=-9L;
    public byte byFld=56;
    public static int iFld=-3;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i7=-11, i8=71, i9=-40305, i10=1, i11=126, i12=13183;
        short s=-25042;
        byte by1=-67;

        i7 = s;
        i7 <<= 220;
        i7 = i8;
        for (i9 = 155; i9 > 1; i9 -= 2) {
            i7 = by1;
            s += (short)i9;
            Test.dFld *= i7;
            i10 += i7;
        }
        if (Test.bFld) {
            for (i11 = 3; 129 > i11; i11++) {
                i10 += (((i11 * Test.fFld) + i7) - Test.fFld);
                i7 = (int)Test.instanceCount;
                Test.bFld = Test.bFld;
                i8 += i7;
                Test.instanceCount += (((i11 * Test.instanceCount) + Test.fFld) - Test.lFld);
            }
        }
        vMeth2_check_sum += i7 + s + i8 + i9 + i10 + by1 + i11 + i12;
    }

    public static void vMeth1() {

        int i5=13530, i6=-105, i13=14, i14=-12911, iArr[]=new int[N];
        byte by2=-104;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(lArr, -3L);

        for (i5 = 9; 224 > i5; i5 += 3) {
            vMeth2();
            i6 = -9;
            iArr[i5] = i5;
            i6 /= (int)(Test.lFld | 1);
            i6 += (i5 * i5);
            try {
                i6 = (i6 / -3280);
                i6 = (i5 % i6);
                iArr[i5 + 1] = (i6 % i6);
            } catch (ArithmeticException a_e) {}
            lArr[i5 - 1] >>= 5;
            Test.lFld -= (long)Test.dFld;
            try {
                iArr[i5 - 1] = (i5 / -38074);
                i6 = (i5 / 843637120);
                i6 = (250 % i5);
            } catch (ArithmeticException a_e) {}
        }
        for (i13 = 17; 349 > i13; i13++) {
            try {
                i14 = (i5 % i13);
                iArr[i13] = (i13 / 252);
                i6 = (iArr[i13] % iArr[i13]);
            } catch (ArithmeticException a_e) {}
            if (Test.bFld) break;
            lArr = lArr;
            Test.instanceCount += by2;
        }
        vMeth1_check_sum += i5 + i6 + i13 + i14 + by2 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i4, byte by) {


        vMeth1();
        Test.instanceCount = i4;
        vMeth_check_sum += i4 + by;
    }

    public void mainTest(String[] strArr1) {

        int i=-237, i1=-4, i2=-209, i3=-38, i15=205, iArr1[]=new int[N];
        short s1=9211, sArr[][]=new short[N][N];
        long l=99L, lArr1[][]=new long[N][N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr1, -101L);
        FuzzerUtils.init(iArr1, 8);
        FuzzerUtils.init(fArr, 116.958F);
        FuzzerUtils.init(sArr, (short)-1675);

        for (i = 13; i < 385; i += 3) {
            for (i2 = 5; 202 > i2; ++i2) {
                vMeth(i, byFld);
                i1 >>= i3;
                if (false) continue;
                i15 = 1;
                do {
                    if (Test.bFld) continue;
                    s1 += (short)Test.fFld;
                    i3 *= i1;
                    switch (((i2 % 2) * 5) + 98) {
                    case 105:
                        if (Test.bFld) break;
                    case 99:
                        switch ((i % 2) + 109) {
                        case 109:
                            i3 = (int)l;
                            lArr1[i][i2 + 1] += i2;
                            break;
                        case 110:
                            i1 *= (int)Test.dFld;
                            break;
                        default:
                            Test.lFld = s1;
                            Test.dFld = s1;
                        }
                        Test.fFld += i1;
                        iArr1[i] *= i3;
                        l &= Test.iFld;
                    default:
                        i1 += i15;
                        i1 += (((i15 * s1) + i1) - i15);
                        i3 += i15;
                        fArr[i - 1] *= Test.iFld;
                    }
                    Test.fFld += (((i15 * i3) + byFld) - Test.iFld);
                    iArr1[i15] += s1;
                    sArr = sArr;
                    Test.fFld += (i15 * i15);
                    Test.fFld += (i15 * Test.fFld);
                    lArr1[i15 - 1][i15 - 1] = -2865006814208449617L;
                } while (++i15 < 2);
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
