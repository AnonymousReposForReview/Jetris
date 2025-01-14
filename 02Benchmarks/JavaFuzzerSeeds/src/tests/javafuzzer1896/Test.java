package tests.javafuzzer1896;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:27:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=13189L;
    public static int iFld=-67;
    public static double dFld=-86.31542;
    public static float fFld=0.305F;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 79);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i2, byte by, byte by1) {

        int i3=8962, i4=-194, i5=-4, i6=-234, i7=-5566;

        Test.dFld += Test.dFld;
        Test.iFld /= (int)((long)(Test.dFld) | 1);
        Test.iFld *= (int)Test.dFld;
        i3 = 1;
        while (++i3 < 330) {
            Test.iArrFld[i3] *= 11;
            i2 >>= Test.iFld;
            for (i4 = i3; i4 < 5; i4 += 3) {
                i2 /= (int)(Test.iFld | 1);
                i5 *= i3;
                for (i6 = 1; i6 < 1; i6 += 3) {
                    switch (((i4 % 6) * 5) + 36) {
                    case 64:
                        switch (((i6 >>> 1) % 1) + 80) {
                        case 80:
                            Test.instanceCount += (i6 * i6);
                            Test.iArrFld[i6 + 1] -= (int)Test.instanceCount;
                            Test.iFld += (int)Test.instanceCount;
                            break;
                        }
                    case 37:
                        Test.iFld += (i6 * i6);
                        break;
                    case 40:
                        i7 = i6;
                        break;
                    case 41:
                        i2 >>= i4;
                    case 53:
                        Test.fFld += i3;
                        break;
                    case 43:
                        Test.iFld += (-1914 + (i6 * i6));
                        break;
                    }
                }
            }
        }
        long meth_res = i2 + by + by1 + i3 + i4 + i5 + i6 + i7;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth1() {

        byte by2=61;
        int i8=39857, i9=-42387, i10=-12, i11=-47795;
        boolean b=true;
        short s=20274;

        Test.iFld = sMeth(Test.iFld, by2, by2);
        i8 = 1;
        while (++i8 < 317) {
            Test.fFld *= Test.instanceCount;
            for (i9 = i8; i9 < 5; ++i9) {
                Test.fFld = Test.instanceCount;
                if (b) break;
                i10 = i8;
                Test.iFld = i10;
                s = (short)i8;
                Test.iFld += i9;
                i11 = 1;
                while (++i11 < 1) {
                    Test.fFld += i11;
                    Test.dFld = i10;
                    Test.instanceCount *= i11;
                    Test.iFld = i10;
                }
            }
        }
        vMeth1_check_sum += by2 + i8 + i9 + i10 + (b ? 1 : 0) + s + i11;
    }

    public static void vMeth() {

        int i1=-47, i12=-51363, i13=-32, i14=12, i15=13, i16=-46126, i17=-7;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-45);

        i1 *= (int)((Test.instanceCount - Double.longBitsToDouble(Test.instanceCount)) * (--Test.iArrFld[(i1 >>> 1) %
            N]));
        i1 += (++i1);
        vMeth1();
        for (i12 = 13; i12 < 361; ++i12) {
            Test.bFld = Test.bFld;
            Test.iFld += 10;
            for (i14 = i12; i14 < 5; i14++) {
                for (i16 = 1; i16 > 1; i16--) {
                    i15 >>>= i17;
                    Test.iFld += (i16 + i12);
                    i13 += 169;
                    i17 += (i16 ^ i16);
                    Test.instanceCount <<= 6;
                    byArr[i12] = (byte)Test.iFld;
                    if (true) continue;
                }
            }
        }
        vMeth_check_sum += i1 + i12 + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=-3895, i19=-13, i20=14, i21=207, i22=-12, i23=-47, i24=79, iArr[]=new int[N];
        byte by3=-44;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -224);
        FuzzerUtils.init(sArr, (short)-28374);
        FuzzerUtils.init(lArr, 0L);

        for (int i : iArr) {
            vMeth();
            if (true) {
                i -= 43;
                iArr[(Test.iFld >>> 1) % N] = i;
                i += 215;
                iArr[(8474 >>> 1) % N] = i;
            } else if (Test.bFld) {
                i >>>= i;
                switch (((i >>> 1) % 2) + 85) {
                case 85:
                    for (i18 = 1; i18 < 63; ++i18) {
                        iArr[i18] *= 72;
                        sArr[i18] -= (short)38290;
                        Test.iArrFld[i18 - 1] -= i;
                        i20 = 2;
                        while ((i20 -= 3) > 0) {
                            Test.instanceCount &= Test.iFld;
                            Test.instanceCount -= i19;
                            i *= by3;
                            Test.iFld += (((i20 * i18) + i18) - i);
                        }
                        Test.dFld += Test.instanceCount;
                    }
                    if (Test.bFld) break;
                case 86:
                    lArr[(i18 >>> 1) % N] = Test.instanceCount;
                    for (i21 = 1; 63 > i21; i21++) {
                        i22 *= (int)Test.instanceCount;
                        Test.instanceCount += (((i21 * Test.iFld) + i21) - i21);
                        Test.instanceCount = i20;
                    }
                    Test.fFld -= (float)Test.dFld;
                    break;
                }
            } else {
                for (i23 = 1; 63 > i23; ++i23) {
                    i24 += i21;
                    i += (int)Test.fFld;
                    Test.iArrFld[i23 - 1] = -26948;
                }
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
//DEBUG  sMeth ->  sMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
