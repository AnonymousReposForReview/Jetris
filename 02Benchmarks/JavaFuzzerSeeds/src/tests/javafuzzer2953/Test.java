package tests.javafuzzer2953;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 23:44:45 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-191L;
    public static float fFld=-1.140F;
    public static short sFld=-3487;
    public boolean bFld=true;
    public static byte byFld=-47;
    public double dFld=0.4722;
    public int iArrFld[]=new int[N];
    public static volatile byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)104);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, long l1) {

        int i5=13, i6=232, i7=27031, i8=26133, i9=-106, i10=-45348, i11=3, iArr2[]=new int[N];
        double d=78.62316;
        short s=10051;
        boolean b1=true;

        FuzzerUtils.init(iArr2, -51874);

        for (i5 = 2; 189 > i5; ++i5) {
            for (i7 = 1; i7 < 9; ++i7) {
                l ^= Test.instanceCount;
                l1 += i6;
                for (d = 1; d < 2; ++d) {
                    iArr2[(int)(d)] <<= (int)l;
                }
            }
            s += (short)(i5 + i9);
            if (b1) continue;
            for (i10 = 1; 9 > i10; i10++) {
                l1 *= l1;
                l1 += (i10 ^ l);
                i8 = i5;
                i9 += (int)Test.instanceCount;
                i9 >>= i9;
            }
            i9 = (int)l;
        }
        vMeth1_check_sum += l + l1 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + i9 + s + (b1 ? 1 : 0) + i10 + i11
            + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth() {

        int i2=-64944, i3=-241, i4=2, i12=9, i13=32854, i14=2966, i15=248, iArr1[]=new int[N];
        double d1=-1.107864;
        byte by=117;

        FuzzerUtils.init(iArr1, 45);

        switch (((iArr1[(i2 >>> 1) % N] >>> 1) % 2) + 122) {
        case 122:
            i3 = 1;
            while (++i3 < 176) {
                i4 = 1;
                while (++i4 < 9) {
                    vMeth1(Test.instanceCount, Test.instanceCount);
                }
                Test.instanceCount <<= i4;
                for (d1 = 1; d1 < 9; d1++) {
                    i2 = (int)Test.fFld;
                    i2 <<= i3;
                    for (i13 = 1; i13 < 2; ++i13) {
                        i12 *= (int)Test.fFld;
                        Test.instanceCount += (i13 * i13);
                        by = (byte)Test.instanceCount;
                    }
                    i15 = 1;
                    while (++i15 < 2) {
                        iArr1[(int)(d1 - 1)] += i2;
                        Test.instanceCount += i15;
                    }
                }
            }
            break;
        case 123:
            Test.fFld -= -14;
            break;
        default:
            i2 = -13;
        }
        vMeth_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d1) + i12 + i13 + i14 + by + i15 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(boolean b, int i1, float f) {

        float f1=-93.377F;
        int i16=12, i17=61057, i18=503, i19=-173, iArr[]=new int[N];
        double d2=86.27377;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 154);
        FuzzerUtils.init(lArr, -14L);

        iArr[(i1 >>> 1) % N] *= (int)((Math.abs(f) - Math.min(i1, i1)) - i1);
        lArr[(i1 >>> 1) % N] = (((Test.instanceCount + Test.instanceCount) * i1) + i1);
        vMeth();
        switch (((14 >>> 1) % 8) + 68) {
        case 68:
            i1 -= (int)Test.instanceCount;
            switch ((((49171 >>> 1) % 2) * 5) + 33) {
            case 41:
                i1 = (int)Test.instanceCount;
                i1 -= (int)Test.instanceCount;
                iArr[(i1 >>> 1) % N] -= i1;
                for (f1 = 21; f1 < 347; f1++) {
                    i1 = i1;
                    i17 = 1;
                    while (++i17 < 5) {
                        for (i18 = i17; i18 < 1; ++i18) {
                            Test.instanceCount ^= -83;
                            i19 -= i16;
                        }
                    }
                }
                break;
            case 39:
                i19 = i16;
                break;
            default:
                d2 = Test.instanceCount;
            }
        case 69:
            iArr[(i1 >>> 1) % N] += i19;
            break;
        case 70:
            b = false;
        case 71:
            Test.instanceCount = i16;
            break;
        case 72:
            i16 = i18;
        case 73:
            Test.sFld = (short)i1;
            break;
        case 74:
            iArr[(i1 >>> 1) % N] = i19;
        case 75:
            i1 = i17;
            break;
        }
        long meth_res = (b ? 1 : 0) + i1 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i16 + i17 + i18 + i19 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=23862, i20=49007, i21=5326, i22=14, i23=231, i24=121, i25=-63576, i26=3283;
        long l2=-7726850113473103866L;

        i += (int)((iMeth(bFld, i, Test.fFld) - Test.fFld) - Test.instanceCount);
        i = (int)-1.188F;
        for (i20 = 9; 346 > i20; ++i20) {
            i += i20;
            i21 += (((i20 * Test.instanceCount) + Test.byFld) - Test.instanceCount);
            iArrFld[i20 + 1] += i;
            for (l2 = 4; 75 > l2; l2++) {
                iArrFld[(int)(l2)] *= Test.byFld;
                Test.fFld *= l2;
                for (i23 = 2; i23 > 1; i23 -= 3) {
                    Test.byArrFld[i23 - 1] += (byte)i24;
                }
                iArrFld[i20 + 1] -= i21;
                iArrFld[(int)(l2 + 1)] = (int)Test.instanceCount;
                if (bFld) break;
                for (i25 = 1; i25 < 2; i25++) {
                    switch (((i20 % 2) * 5) + 116) {
                    case 125:
                        iArrFld[i20 - 1] *= (int)Test.fFld;
                        break;
                    case 122:
                        i26 = i26;
                        break;
                    default:
                        i += (((i25 * Test.fFld) + Test.instanceCount) - i21);
                    }
                    if (false) {
                        i = (int)207136173L;
                    } else {
                        Test.byFld += (byte)(((i25 * l2) + Test.instanceCount) - Test.sFld);
                    }
                    i22 *= (int)dFld;
                    iArrFld = iArrFld;
                    Test.byFld += (byte)(i25 * i25);
                    iArrFld[i25 + 1] += i22;
                }
                try {
                    i22 = (iArrFld[i20 - 1] % 49203);
                    i26 = (79 % iArrFld[(int)(l2 + 1)]);
                    iArrFld[(int)(l2 + 1)] = (i21 % -216);
                } catch (ArithmeticException a_e) {}
            }
            i += (-28 + (i20 * i20));
            i24 >>= i26;
            Test.fFld = Test.byFld;
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
