package tests.javafuzzer2216;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:22:46 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=5L;
    public static boolean bFld=true;
    public static float fFld=0.468F;
    public static double dFld=10.61614;
    public int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];
    public int iArrFld1[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static void vMeth() {

        int i3=2, iArr[][]=new int[N][N];

        FuzzerUtils.init(iArr, -214);

        iArr[(i3 >>> 1) % N][(-54680 >>> 1) % N] = (int)(-((i3 += (int)Test.instanceCount) + (-56 - (46.135F +
            (~i3)))));
        vMeth_check_sum += i3 + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth(long l3) {

        int i8=22348, i9=-4962, i10=-13, i11=-5, i12=25691, i13=8;
        float f1=0.925F;
        double d1=1.130022;
        short s=-23492;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        for (i8 = 1; i8 < 345; i8++) {
            bArr = bArr;
            i9 = -38819;
            switch (((4 >>> 1) % 2) + 86) {
            case 86:
                if (false) continue;
                f1 = 91;
            case 87:
                f1 += (i8 + i9);
                break;
            default:
                l3 += (3 + (i8 * i8));
                try {
                    i9 = (-12041 % i8);
                    i9 = (i8 % i8);
                    i9 = (-1052809239 / i8);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += i9;
                for (i10 = 5; 1 < i10; i10 -= 3) {
                    for (i12 = 1; i12 < 5; i12++) {
                        f1 *= (float)d1;
                    }
                    if (i8 != 0) {
                    }
                    s -= (short)i10;
                }
            }
        }
        long meth_res = l3 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) +
            s + FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(long l2, double d) {

        int i5=-39311, i6=108, i7=20874, i14=98, i15=42736, iArr1[]=new int[N];
        short s1=23922, sArr[]=new short[N];
        byte by=23;
        float f2=-1.452F;

        FuzzerUtils.init(sArr, (short)-29817);
        FuzzerUtils.init(iArr1, -3);

        for (i5 = 7; 155 > i5; ++i5) {
            i7 = 1;
            while (++i7 < 11) {
                fMeth(Test.instanceCount);
                i6 = s1;
                sArr[i5 + 1] &= (short)i7;
                Test.instanceCount += (24305 + (i7 * i7));
                if (i6 != 0) {
                }
                i6 += -6;
                switch ((((i6 >>> 1) % 4) * 5) + 53) {
                case 65:
                    if (Test.bFld) continue;
                    if (Test.bFld) break;
                    i6 -= by;
                    break;
                case 70:
                    for (f2 = 1; f2 < 1; ++f2) {
                        i14 -= (int)114.6493;
                        i15 += -64;
                    }
                case 61:
                    try {
                        i14 = (-22046 % i15);
                        i14 = (iArr1[(i15 >>> 1) % N] % i7);
                        i6 = (116 / i7);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 58:
                    Test.fFld += (i7 - Test.fFld);
                    break;
                default:
                    Test.fFld -= i6;
                }
            }
        }
        long meth_res = l2 + Double.doubleToLongBits(d) + i5 + i6 + i7 + s1 + by + Float.floatToIntBits(f2) + i14 + i15
            + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(long l1, int i4) {

        int i16=23798, i17=13, i18=-159, i19=3, i20=190;
        byte by1=-6;

        i4 -= ((i4--) * iMeth(l1, Test.dFld));
        for (i16 = 330; i16 > 9; --i16) {
            l1 -= (long)Test.dFld;
            i18 = 1;
            do {
                if (i17 != 0) {
                    vMeth1_check_sum += l1 + i4 + i16 + i17 + i18 + i19 + i20 + by1;
                    return;
                }
                iArrFld[i16] = i17;
                for (i19 = 1; i19 < 1; i19++) {
                    short s2=-23145;
                    Test.instanceCount = s2;
                    if (true) continue;
                    switch ((i19 % 8) + 114) {
                    case 114:
                        try {
                            i4 = (i18 / i17);
                            i20 = (i19 % -50);
                            iArrFld[i18] = (559952588 % iArrFld[i18]);
                        } catch (ArithmeticException a_e) {}
                        lArrFld[i18] <<= i4;
                        break;
                    case 115:
                        i20 *= (int)Test.dFld;
                        break;
                    case 116:
                        iArrFld = iArrFld;
                        iArrFld1 = iArrFld1;
                        break;
                    case 117:
                        l1 -= i16;
                        break;
                    case 118:
                        if (Test.bFld) break;
                        break;
                    case 119:
                        by1 *= (byte)i19;
                        break;
                    case 120:
                        iArrFld1[i19] >>= (int)Test.instanceCount;
                    case 121:
                        i4 += 51114;
                        break;
                    }
                }
            } while (++i18 < 5);
        }
        vMeth1_check_sum += l1 + i4 + i16 + i17 + i18 + i19 + i20 + by1;
    }

    public void mainTest(String[] strArr1) {

        int i=-246, i1=-21, i2=7535, i21=-42834, i22=-9, i23=-205, i24=210, i25=-41552, i26=-11154, i27=98, i28=-48904,
            i29=-190, i30=-57569, i31=-10, i32=64152, i33=7, i34=0, i35=3, i36=-9057;
        float f=1.82F;
        long l=2558330044L;

        i -= (int)(f++);
        for (i1 = 7; i1 < 184; ++i1) {
            i2 = iArrFld[i1 + 1];
            Test.instanceCount += i1;
        }
        l = 1;
        while (++l < 225) {
            i2 += (-i2);
            vMeth();
            vMeth1(l, 14429);
            for (i21 = (int)(l); i21 < 112; ++i21) {
                i += i21;
                i2 += 70;
            }
        }
        for (i23 = 2; i23 < 299; i23++) {
            Test.bFld = Test.bFld;
            i22 += (((i23 * i24) + i25) - i23);
        }
        Test.dFld = i1;
        i26 += i;
        for (i27 = 5; i27 < 195; i27++) {
            for (i29 = 132; i29 > i27; i29 -= 2) {
                Test.instanceCount += -24461;
                for (i31 = 1; i31 > 1; --i31) {
                    i22 += (-147 + (i31 * i31));
                }
                i28 += (int)f;
                Test.instanceCount >>= Test.instanceCount;
            }
            Test.bFld = Test.bFld;
            for (i33 = 8; i33 < 132; i33++) {
                Test.dFld = Test.instanceCount;
                i26 *= 118;
                for (i35 = 1; i35 < 2; ++i35) {
                    Test.instanceCount += (4 + (i35 * i35));
                    if (Test.bFld) continue;
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
//DEBUG  vMeth1 ->  vMeth1 mainTest
//DEBUG  iMeth ->  iMeth vMeth1 mainTest
//DEBUG  fMeth ->  fMeth iMeth vMeth1 mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}