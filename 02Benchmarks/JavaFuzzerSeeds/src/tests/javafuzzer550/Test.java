package tests.javafuzzer550;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 05:32:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2954223703L;
    public volatile int iFld=-8;
    public static float fFld=-17.403F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 3);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l3, int i1, int i2) {

        float f=-1.845F, f1=47.689F;
        int i3=3, i4=2, i5=20414, i6=-18635, i7=-204, iArr[]=new int[N];
        boolean b=false;
        double d1=39.72680, dArr[]=new double[N];

        FuzzerUtils.init(iArr, -1);
        FuzzerUtils.init(dArr, 0.119427);

        iArr[(i2 >>> 1) % N] = 209;
        for (f = 155; f > 2; f -= 3) {
            iArr = iArr;
            iArr[(int)(f)] <<= i3;
            b = b;
            f1 = i2;
            switch ((int)((f % 1) + 61)) {
            case 61:
                for (i4 = 30; i4 > 1; i4 -= 2) {
                    dArr = dArr;
                    for (i6 = 1; i6 < 3; i6++) {
                        d1 -= l3;
                        i1 += (int)d1;
                        i1 *= i5;
                        iArr[(int)(f + 1)] *= i2;
                        iArr[i6] += i1;
                    }
                }
                break;
            default:
                try {
                    iArr[(int)(f)] = (i5 % 43593);
                    i7 = (iArr[(int)(f)] / i4);
                    i3 = (iArr[(int)(f - 1)] % i5);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = l3 + i1 + i2 + Float.floatToIntBits(f) + i3 + (b ? 1 : 0) + Float.floatToIntBits(f1) + i4 + i5
            + i6 + i7 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l1, long l2) {

        double d=5.21994;
        int i8=9, i9=-22, i10=17599, i11=-56179, i12=-60319, i13=-14, i14=-33451, i15=2;
        float f2=-17.938F;
        boolean b1=true;
        short s=32556;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 53563L);

        l1 = (long)(d - iMeth(l1, i8, -104));
        for (i9 = 3; 214 > i9; i9++) {
            for (i11 = 1; 8 > i11; ++i11) {
                Test.iArrFld[i9 + 1] -= i9;
                switch ((i9 % 6) + 110) {
                case 110:
                case 111:
                    i10 = -28321;
                case 112:
                    f2 *= l1;
                    i10 = i9;
                    f2 -= i10;
                    break;
                case 113:
                case 114:
                case 115:
                    if (true) {
                        for (i13 = 2; i13 > i9; i13--) {
                            i14 = 47590;
                            lArr[i13] += i14;
                            lArr = lArr;
                            i14 = (int)l2;
                        }
                    } else if (b1) {
                        i15 += (int)Test.instanceCount;
                    } else {
                        i14 *= s;
                    }
                    break;
                default:
                    i8 += (((i11 * i11) + i12) - i8);
                }
            }
        }
        vMeth1_check_sum += l1 + l2 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f2)
            + i13 + i14 + i15 + (b1 ? 1 : 0) + s + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i, long l) {

        int i16=-27, i17=-59195, i18=69, i19=34803, i20=9121;
        long l4=9091914887521561321L;
        double d2=2.56471;
        float f3=-2.7F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 120.515F);

        vMeth1(1058748093L, l);
        i *= i;
        for (i16 = 4; i16 < 138; i16++) {
            i17 = i16;
        }
        for (l4 = 3; 249 > l4; l4++) {
            i <<= i;
            try {
                i18 = (i / -930);
                i18 = (i19 / i);
                i17 = (i19 / i19);
            } catch (ArithmeticException a_e) {}
            d2 = i18;
            for (f3 = 1; f3 < 7; ++f3) {
                i18 = 16263;
                Test.fFld += i17;
            }
            Test.fFld -= -34089;
            fArr1[(int)(l4 + 1)] += l4;
            i -= i;
            i19 *= i20;
        }
        vMeth_check_sum += i + l + i16 + i17 + l4 + i18 + i19 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f3)
            + i20 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i21=44830, i22=-34944, i23=-6, i24=-113, i25=106, i26=-58659, i27=8, i28=5373;
        boolean b2=false;
        double d3=98.54615;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 75.215F);

        fArr[(iFld >>> 1) % N] = Test.instanceCount;
        vMeth(iFld, 7L);
        iFld -= iFld;
        Test.instanceCount += i21;
        for (i22 = 8; i22 < 283; ++i22) {
            i21 += (int)Test.instanceCount;
        }
        i23 = iFld;
        Test.fFld = i21;
        Test.fFld += iFld;
        Test.instanceCount = i22;
        Test.fFld = Test.instanceCount;
        i23 += (int)-5821L;
        i23 >>= i21;
        i24 = 1;
        do {
            if (b2) continue;
            i21 += (i24 | Test.instanceCount);
            iFld -= (int)d3;
            i23 >>>= i22;
            iFld = i21;
            switch ((i24 % 2) + 40) {
            case 40:
                iFld += (i24 - i24);
                i21 <<= i22;
                break;
            case 41:
                if (false) {
                    for (i25 = 150; i25 > 3; --i25) {
                        Test.iArrFld[i24] *= (int)Test.fFld;
                        for (i27 = i25; 2 > i27; ++i27) {
                            if (false) continue;
                            Test.iArrFld[i25 - 1] = i23;
                            i28 = -4;
                            Test.iArrFld[i24 - 1] <<= i28;
                        }
                    }
                }
                break;
            default:
                Test.fFld /= (i28 | 1);
            }
        } while (++i24 < 167);



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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
