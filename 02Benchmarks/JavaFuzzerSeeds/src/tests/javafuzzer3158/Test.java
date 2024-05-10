package tests.javafuzzer3158;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 03:01:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=45446L;
    public float fFld=112.795F;
    public static volatile int iFld=-69;
    public static double dFld=59.91950;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1) {

        int i10=0, i11=7, iArr1[]=new int[N];
        byte by1=50;
        boolean b=true;
        short s1=-15100;

        FuzzerUtils.init(iArr1, 108);

        for (int i9 : iArr1) {
            iArr1[(Test.iFld >>> 1) % N] -= (int)f1;
            Test.iFld <<= (int)Test.instanceCount;
            i9 = Test.iFld;
        }
        for (i10 = 376; i10 > 17; --i10) {
            f1 += i10;
            by1 += (byte)(50492L + (i10 * i10));
            if (b) break;
            Test.instanceCount += (long)(-45.393F + (i10 * i10));
            b = b;
            Test.instanceCount |= s1;
            Test.iFld = Test.iFld;
            Test.iFld += i10;
        }
        i11 = (int)f1;
        i11 *= (int)Test.dFld;
        vMeth1_check_sum += Float.floatToIntBits(f1) + i10 + i11 + by1 + (b ? 1 : 0) + s1 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        int i6=-237, i7=7, i8=37319, i12=-121, i13=3, i14=21991;
        float f2=79.80F;
        double d=0.39527;

        i6 = 1;
        while (++i6 < 353) {
            Test.iFld += (int)((Test.instanceCount++) << (--Test.iFld));
        }
        for (i7 = 3; i7 < 213; ++i7) {
            i8 += i7;
        }
        vMeth1(f2);
        Test.dFld -= -3698;
        try {
            i8 += -16;
            f2 *= f2;
            for (i12 = 16; 353 > i12; i12++) {
                for (d = 1; d < 5; d++) {
                    switch ((int)(((d % 1) * 5) + 107)) {
                    case 109:
                        i14 += (int)(d + i14);
                        i13 = 7;
                        Test.iFld %= -8177;
                        break;
                    }
                }
            }
        }
        catch (ArithmeticException exc1) {
            i8 -= 34117;
        }
        vMeth_check_sum += i6 + i7 + i8 + Float.floatToIntBits(f2) + i12 + i13 + Double.doubleToLongBits(d) + i14;
    }

    public static int iMeth(long l, int i2) {

        int i3=-1363, i4=-148, i5=41, i15=-198, iArr[]=new int[N];
        float f=2.514F, f3=109.508F;
        short s=-6279;
        byte by=-34;
        long l1=-64L;

        FuzzerUtils.init(iArr, 12);

        i3 = 1;
        while (++i3 < 200) {
            i2 -= (int)((~(long)(2 - (f + i3))) - ((0 - (i2++)) + l));
            i2 = ((iArr[i3 - 1]--) * iArr[i3 + 1]);
            s += (short)(((i3 * l) + i2) - by);
        }
        l1 = 1;
        do {
            for (i4 = 6; i4 > l1; i4--) {
                vMeth();
                i2 >>= i3;
                Test.dFld = 38803;
            }
            s += (short)i3;
            f -= i3;
            for (f3 = 1; f3 < 6; f3++) {
                i5 += (int)(f3 * i5);
                i5 += (int)(f3 - i15);
                l = i4;
            }
        } while (++l1 < 295);
        long meth_res = l + i2 + i3 + Float.floatToIntBits(f) + s + by + l1 + i4 + i5 + Float.floatToIntBits(f3) + i15
            + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-14616, i1=52316, i16=119, i17=124, i18=-124, i19=-107, i20=-2, iArr2[]=new int[N];
        byte by2=94;
        boolean b2=true;

        FuzzerUtils.init(iArr2, -8209);

        for (i = 7; i < 394; ++i) {
            fFld -= iMeth(Test.instanceCount, i1);
            i1 += i1;
            Test.instanceCount &= Test.instanceCount;
            switch ((i % 2) + 77) {
            case 77:
                i1 = (int)Test.instanceCount;
                Test.instanceCount += (i - i);
                switch ((i % 6) + 115) {
                case 115:
                case 116:
                    if (false) break;
                    Test.instanceCount -= i1;
                    i16 = 1;
                    while (++i16 < 65) {
                        Test.instanceCount = 91;
                        Test.instanceCount = Test.instanceCount;
                    }
                case 117:
                case 118:
                    Test.iFld += -19757;
                    fFld = i16;
                    i1 = (int)Test.instanceCount;
                    i1 >>= i1;
                    break;
                case 119:
                    iArr2[i - 1] += i16;
                    break;
                case 120:
                    for (i17 = 2; i17 < 65; i17++) {
                        for (i19 = 1; 2 > i19; i19++) {
                            boolean b1=true;
                            i18 = (int)Test.instanceCount;
                            iArr2[i19 - 1] = 133;
                            switch ((i % 6) + 67) {
                            case 67:
                                b1 = true;
                                break;
                            case 68:
                                iArr2[i17 + 1] = (int)Test.instanceCount;
                                Test.instanceCount |= i20;
                                Test.iFld |= 29516;
                                break;
                            case 69:
                                i1 += (int)Test.instanceCount;
                                fFld *= by2;
                                break;
                            case 70:
                                i18 += (i19 - i20);
                                break;
                            case 71:
                                iArr2[i17] += Test.iFld;
                                break;
                            case 72:
                                Test.dFld = Test.instanceCount;
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 78:
                b2 = b2;
                break;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}