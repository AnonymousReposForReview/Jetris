package tests.javafuzzer524;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:17:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1258L;
    public float fFld=-43.507F;
    public static double dFld=-119.114396;
    public static short sFld=10635;
    public volatile int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public int iMeth(long l1, int i4) {

        int i5=-29896, i6=235, i7=-12, i8=126, i9=6, i10=4;

        for (i5 = 5; i5 < 342; i5++) {
            for (i7 = 1; i7 < 5; ++i7) {
                iArrFld[i5] -= i4;
                i8 ^= -5315;
                for (i9 = 2; i9 > 1; i9--) {
                    iArrFld[i5 - 1] -= 18636;
                    switch (((i8 >>> 1) % 3) + 3) {
                    case 3:
                        iArrFld[i7] += (int)49851L;
                        break;
                    case 4:
                        i6 += (176 + (i9 * i9));
                        i4 -= i5;
                        break;
                    case 5:
                        i4 += i9;
                        Test.instanceCount <<= i5;
                        i10 += (i9 | Test.instanceCount);
                        break;
                    }
                }
                try {
                    iArrFld[i7 + 1] = (i10 % -1419454477);
                    i6 = (iArrFld[i7 - 1] / 168);
                    iArrFld[i5] = (i5 % i4);
                } catch (ArithmeticException a_e) {}
            }
            fFld += i4;
        }
        long meth_res = l1 + i4 + i5 + i6 + i7 + i8 + i9 + i10;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public float fMeth() {

        int i3=65203;
        byte by=77;
        short s=-20251;

        i3 *= iMeth(Test.instanceCount, 11);
        Test.instanceCount -= 95;
        by = (byte)s;
        long meth_res = i3 + by + s;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public long lMeth(long l) {

        int i2=1, i11=10, i12=121, i13=-156, i14=-35916, i15=8052, i16=164, i17=3;
        byte by1=-7;
        double d=2.41326;

        i2 = (int)((fMeth() - Test.instanceCount) + l);
        lArrFld[(i2 >>> 1) % N] -= i2;
        for (i11 = 4; i11 < 135; i11++) {
            for (i13 = 1; i13 < 12; i13++) {
                Test.instanceCount = -9L;
            }
            fFld = i12;
            i15 = 1;
            while (++i15 < 12) {
                i12 -= (int)fFld;
                Test.instanceCount = by1;
                for (i16 = 1; i16 < 1; i16 += 3) {
                    Test.instanceCount <<= i2;
                }
                i14 -= i16;
                fFld = -9;
                by1 *= (byte)fFld;
                i14 += (int)d;
            }
        }
        long meth_res = l + i2 + i11 + i12 + i13 + i14 + i15 + by1 + i16 + i17 + Double.doubleToLongBits(d);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-25871, i1=-4, i18=45598, i19=-42110, i20=3;
        boolean b=false;
        long l3=229L;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)28);

        for (i = 21; i < 388; i += 3) {
            iArrFld = (iArrFld = iArrFld);
            Test.instanceCount <<= lMeth(Test.instanceCount);
            if (b) {
                byArr[i - 1] -= (byte)215;
                i1 >>= (int)Test.instanceCount;
            } else {
                i1 *= (int)Test.instanceCount;
                Test.instanceCount = i1;
                for (l3 = 5; l3 < 205; ++l3) {
                    i1 = i1;
                    iArrFld[i + 1] = (int)Test.instanceCount;
                    for (i19 = 1; i19 < 2; ++i19) {
                        switch ((((i19 >>> 1) % 5) * 5) + 101) {
                        case 126:
                            i20 += (i19 + i20);
                            i1 += (i19 - i1);
                            i18 += (int)fFld;
                            i18 = (int)Test.dFld;
                        case 106:
                            Test.instanceCount = Test.instanceCount;
                            break;
                        case 116:
                            i18 = Test.sFld;
                            i18 = 70;
                            break;
                        case 107:
                            iArrFld[i + 1] = -4764;
                            i20 -= (int)7.1021F;
                            try {
                                i1 = (iArrFld[(i18 >>> 1) % N] % i19);
                                i1 = (i18 / -82);
                                i20 = (i18 % iArrFld[(int)(l3)]);
                            } catch (ArithmeticException a_e) {}
                            Test.sFld >>= (short)23649;
                            break;
                        case 113:
                            i18 = i1;
                            Test.instanceCount = -6;
                        }
                        lArrFld[i19 + 1] = i;
                        i20 -= Test.sFld;
                        i18 = i;
                        Test.instanceCount += Test.instanceCount;
                    }
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
