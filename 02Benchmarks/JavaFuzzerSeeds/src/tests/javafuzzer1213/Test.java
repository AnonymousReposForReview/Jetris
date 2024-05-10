package tests.javafuzzer1213;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 16:35:33 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3020161182L;
    public static byte byFld=-126;
    public boolean bFld=false;
    public float fArrFld[]=new float[N];

    public static long vMeth_check_sum = 0;
    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static void vMeth(long l, int i3) {


        Test.instanceCount -= i3;
        i3 = i3;
        vMeth_check_sum += l + i3;
    }

    public static float fMeth(int i7, double d2) {

        float f1=101.982F, f2=-1.627F, f3=-2.500F;
        double d3=-1.53946, dArr[]=new double[N];
        int i8=3, i9=5, i10=65, i11=-135;
        byte by=19;

        FuzzerUtils.init(dArr, 72.14859);

        f1 -= Test.instanceCount;
        d3 = 1;
        do {
            i7 = (int)f1;
            switch ((int)(((d3 % 2) * 5) + 1)) {
            case 3:
                for (i8 = (int)(d3); i8 < 6; i8++) {
                    i9 <<= -31141;
                    i7 -= 6;
                    i7 += i9;
                    for (f2 = 1; f2 < 1; ++f2) {
                        i9 += i9;
                        try {
                            i9 = (126 / i10);
                            i9 = (i8 % 153);
                            i10 = (i8 / -1897517946);
                        } catch (ArithmeticException a_e) {}
                    }
                    switch (((i8 % 3) * 5) + 89) {
                    case 92:
                        for (f3 = 1; 1 > f3; ++f3) {
                            i10 += (int)(((f3 * i7) + i9) - i9);
                            dArr[(int)(f3 + 1)] += i7;
                        }
                        break;
                    case 95:
                        i9 *= i10;
                        break;
                    case 101:
                        i9 *= (int)f2;
                        break;
                    }
                }
                break;
            case 6:
                i7 = by;
                break;
            default:
                i7 = (int)Test.instanceCount;
            }
        } while (++d3 < 252);
        long meth_res = i7 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) + Double.doubleToLongBits(d3) + i8
            + i9 + Float.floatToIntBits(f2) + i10 + Float.floatToIntBits(f3) + i11 + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth(int i5, int i6) {

        double d1=-107.98195, dArr1[]=new double[N];
        int i12=-34952, i13=-154, i14=37846, i15=-5449, iArr[]=new int[N];
        float f4=0.741F;
        boolean b=true;
        short s=-1581;

        FuzzerUtils.init(iArr, 9261);
        FuzzerUtils.init(dArr1, 2.77967);

        iArr[(i5 >>> 1) % N] = (int)Math.abs(--Test.instanceCount);
        d1 = 1;
        do {
            i5 -= (int)((i5 + (i6 - -72.846F)) - (fMeth(i5, d1) + i5));
            for (i12 = 1; i12 < 13; ++i12) {
                f4 = i5;
                i13 = i13;
                Test.instanceCount *= i5;
            }
            dArr1[(int)(d1 + 1)] += Test.instanceCount;
            for (i14 = 1; i14 < 13; i14 += 3) {
                if (b) break;
            }
            dArr1[(int)(d1 - 1)] += Test.instanceCount;
            i6 += s;
            i13 += i14;
            Test.instanceCount += -136L;
        } while (++d1 < 125);
        i6 = (int)Test.instanceCount;
        long meth_res = i5 + i6 + Double.doubleToLongBits(d1) + i12 + i13 + Float.floatToIntBits(f4) + i14 + i15 + (b ?
            1 : 0) + s + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth() {

        int i4=-214;

        i4 -= Math.min(Math.max(++i4, (int)(-lMeth(-13, i4))), i4);
        vSmallMeth_check_sum += i4;
    }

    public void mainTest(String[] strArr1) {

        int i=-195, i1=-12, i2=5, i16=4, i17=-54822, i18=9, i19=-427, i20=22468, i21=-8, iArr1[]=new int[N];
        float f=-14.546F, f5=5.252F, f6=3.537F;
        double d=-23.113208;
        short s1=24300;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 704560191L);
        FuzzerUtils.init(iArr1, 27411);

        i -= (--i);
        for (i1 = 130; i1 > 7; i1 -= 2) {
            i -= (-64454 - ((i1 + i1) * (i2--)));
            f %= ((long)(Math.abs(d += 27)) | 1);
        }
        vMeth(++Test.instanceCount, ++i2);
        for (int smallinvoc=0; smallinvoc<792; smallinvoc++) vSmallMeth();
        lArr[(-44672 >>> 1) % N] += i2;
        for (i16 = 12; i16 < 304; i16++) {
            Test.instanceCount -= Test.byFld;
            fArrFld[i16 - 1] += i;
            i2 = i17;
        }
        bFld = bFld;
        for (f5 = 4; 362 > f5; f5++) {
            Test.instanceCount *= -2;
            d *= i17;
            d = f5;
            i2 -= (int)-258771279522213539L;
            i18 = i;
            f += i18;
            i18 = i16;
            switch ((((i2 >>> 1) % 1) * 5) + 45) {
            case 50:
                switch ((int)((f5 % 7) + 98)) {
                case 98:
                    i *= i2;
                    f += 12;
                    i17 += (int)((long)f5 ^ i18);
                    break;
                case 99:
                    lArr[(int)(f5)] -= i;
                    for (f6 = 3; f6 < 70; ++f6) {
                        for (i20 = 1; i20 < 2; ++i20) {
                            i += (int)d;
                            i18 = i17;
                        }
                    }
                    break;
                case 100:
                    i2 -= 30346;
                    break;
                case 101:
                    f += i;
                    break;
                case 102:
                    iArr1[(int)(f5 - 1)] += i17;
                case 103:
                    i18 |= s1;
                    break;
                case 104:
                    if (false) continue;
                default:
                    Test.instanceCount -= 49L;
                }
            default:
                Test.instanceCount = 56271;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  fMeth ->  fMeth lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
