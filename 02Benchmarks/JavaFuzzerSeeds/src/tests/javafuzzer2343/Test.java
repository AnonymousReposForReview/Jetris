package tests.javafuzzer2343;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 12:58:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-23L;
    public static float fFld=119.361F;
    public static volatile byte byFld=-58;
    public static short sFld=-5572;
    public volatile int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i8=-33752, i9=-57514, i10=35217, i12=-70, i13=150, i14=23811, i15=-19070, iArr[]=new int[N];
        long l2=-3949223024L;
        float f=-2.737F, fArr[]=new float[N];
        short s=-14941;
        boolean b=false;

        FuzzerUtils.init(iArr, -55);
        FuzzerUtils.init(fArr, -66.480F);

        iArr[(i8 >>> 1) % N] <<= i8;
        for (l2 = 23; l2 < 378; ++l2) {
            Test.instanceCount = i9;
            if (i9 != 0) {
            }
            i8 += (int)l2;
            for (f = 1; 5 > f; f++) {
                s = (short)-19205;
            }
            Test.byFld = (byte)i8;
            for (i12 = 1; i12 < 5; i12 += 3) {
                for (i14 = 1; i14 < 5; ++i14) {
                    i15 &= i15;
                    Test.instanceCount += i8;
                }
                if (b) continue;
                Test.instanceCount <<= i14;
                fArr[(int)(l2)] *= 11;
            }
        }
        long meth_res = i8 + l2 + i9 + Float.floatToIntBits(f) + i10 + s + i12 + i13 + i14 + i15 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, int i5, long l1) {

        int i6=-6078, i7=5, i16=-12887, i17=-38671, i18=52364, i19=150;
        boolean b1=true, bArr[]=new boolean[N];
        double d=0.49364;

        FuzzerUtils.init(bArr, true);

        for (i6 = 10; i6 < 246; i6++) {
            iMeth1();
            i7 *= i5;
            Test.sFld <<= (short)i6;
            switch (((i6 % 2) * 5) + 16) {
            case 25:
                for (i16 = 7; i16 > 1; i16 -= 2) {
                    l1 *= Test.instanceCount;
                    switch ((i16 % 5) + 32) {
                    case 32:
                        if (b1) break;
                        for (i18 = i6; 3 > i18; i18++) {
                            if (b1) continue;
                        }
                        d = Test.instanceCount;
                        break;
                    case 33:
                        d -= i4;
                        bArr = bArr;
                        i5 <<= i17;
                        break;
                    case 34:
                        i19 = (int)Test.instanceCount;
                        break;
                    case 35:
                        Test.fFld *= i7;
                        break;
                    case 36:
                    }
                }
                break;
            case 18:
                i17 += i6;
                break;
            default:
                i19 *= i17;
            }
        }
        vMeth_check_sum += i4 + i5 + l1 + i6 + i7 + i16 + i17 + (b1 ? 1 : 0) + i18 + i19 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(bArr);
    }

    public int iMeth(long l, int i2, int i3) {

        long l3=-58418L;
        int i20=-9, i21=-53676, i22=213;
        boolean b2=true;
        double d1=95.88131;

        vMeth(i2, i2, l);
        l3 = 1;
        do {
            i20 = 1;
            do {
                b2 = b2;
                Test.fFld = Test.fFld;
                i2 *= i20;
                iArrFld[i20] += i2;
                Test.fFld -= 12;
                d1 += 7;
                i3 = i3;
                Test.sFld -= (short)i3;
                Test.instanceCount += l;
            } while (++i20 < 7);
            for (i21 = 7; i21 > l3; --i21) {
                Test.fFld = i20;
                i3 = i3;
            }
        } while (++l3 < 215);
        long meth_res = l + i2 + i3 + l3 + i20 + (b2 ? 1 : 0) + Double.doubleToLongBits(d1) + i21 + i22;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-127, i1=217, i23=-148, i24=37769, i25=-11, i26=-24255, i28=9417, iArr1[][]=new int[N][N];
        float f1=0.737F;
        boolean b3=true;

        FuzzerUtils.init(iArr1, -7);

        for (i = 137; i > 1; i -= 3) {
            Test.fFld = ((iArrFld[i + 1] - -7L) - iMeth(-32252L, i, i1));
            for (i23 = 14; i23 < 311; i23++) {
                for (f1 = 2; f1 > 1; f1--) {
                    i24 += i26;
                    i25 += (int)Test.instanceCount;
                }
                Test.instanceCount += i25;
            }
            i24 += (i + Test.instanceCount);
            for (int i27 : iArrFld) {
                i28 = 1;
                while (++i28 < 2) {
                    switch (((i >>> 1) % 4) + 61) {
                    case 61:
                        Test.sFld = (short)i24;
                        break;
                    case 62:
                        switch (((i26 >>> 1) % 2) + 113) {
                        case 113:
                            i25 = 12;
                            if (b3) continue;
                            iArrFld[i28] += i23;
                            break;
                        case 114:
                            if (true) break;
                            i27 += (i28 * i28);
                            break;
                        }
                        iArrFld[i] -= 4;
                    case 63:
                        if (b3) break;
                        break;
                    case 64:
                        i27 -= -3;
                        break;
                    default:
                        Test.fFld += i25;
                        i27 = (int)Test.instanceCount;
                        Test.instanceCount += i23;
                        i1 >>= i1;
                    }
                    Test.instanceCount = (long)105.638F;
                }
                iArr1 = iArr1;
                Test.fFld = i28;
                i27 += (((i * f1) + Test.instanceCount) - Test.byFld);
                i27 += i;
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}