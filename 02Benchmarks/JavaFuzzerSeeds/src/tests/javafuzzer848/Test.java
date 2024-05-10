package tests.javafuzzer848;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:54:51 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=49L;
    public static short sFld=-11870;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -35485);
        FuzzerUtils.init(Test.fArrFld, -1.338F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(int i6) {

        int i7=36041, i8=-12156, i9=-30305, i10=-113;
        float f2=1.476F, fArr[]=new float[N];
        double d1=-3.87333;
        boolean b1=true;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-65);
        FuzzerUtils.init(fArr, 30.1018F);

        if (b1) {
            for (byte by : byArr) {
                i6 = (int)Test.instanceCount;
                for (i7 = 1; i7 < 4; i7++) {
                    boolean b=true;
                    Test.iArrFld[i7] &= i8;
                    if (b) {
                        i6 = i8;
                        i8 *= (int)-9.36076;
                    } else if (b) {
                        i8 = 98;
                    }
                    for (i9 = 1; i9 < 2; i9++) {
                        i10 *= i6;
                        switch (((i6 >>> 1) % 6) + 28) {
                        case 28:
                            if (b) continue;
                            i10 += i10;
                            i8 *= i10;
                            break;
                        case 29:
                            Test.instanceCount += (((i9 * i6) + Test.instanceCount) - i10);
                            break;
                        case 30:
                            f2 *= (float)d1;
                            break;
                        case 31:
                            i6 += i6;
                            break;
                        case 32:
                            b = b;
                        case 33:
                            fArr[i9 - 1] = i9;
                            break;
                        default:
                            i10 += (((i9 * i7) + i10) - i9);
                        }
                    }
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d1) + (b1 ? 1 : 0)
            + FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth1(float f1) {

        int i3=-61706, i4=-53, i5=135, i12=-30005, i13=-16;
        long l=3547946496384794331L;
        byte by1=59;

        for (i3 = 14; 376 > i3; i3++) {
            Test.instanceCount += (-(i5--));
            Test.sFld <<= byMeth(i4);
            Test.instanceCount += i5;
            i4 += 12;
            i5 <<= i4;
            i4 >>= i3;
            i12 = 1;
            while (++i12 < 5) {
                for (l = i3; 1 > l; ++l) {
                    Test.sFld = (short)Test.instanceCount;
                    Test.instanceCount += (l * l);
                }
                i4 /= (int)((long)(f1) | 1);
                by1 += (byte)(((i12 * i12) + Test.sFld) - Test.instanceCount);
                Test.instanceCount *= i4;
            }
        }
        Test.instanceCount += i12;
        vMeth1_check_sum += Float.floatToIntBits(f1) + i3 + i4 + i5 + i12 + l + i13 + by1;
    }

    public static void vMeth(int i, int i1, int i2) {

        double d=2.409;
        float f=-2.187F;
        int i14=39504, i15=1, i16=74, i17=-228, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -4);

        i = (int)((++d) - (Test.iArrFld[(i >>> 1) % N] - (f * d)));
        vMeth1(0.392F);
        i1 = 11;
        Test.instanceCount *= i;
        d -= Test.instanceCount;
        i1 &= Test.sFld;
        for (i14 = 165; 6 < i14; i14 -= 2) {
            for (i16 = 1; i16 < 19; i16++) {
                switch (((i >>> 1) % 2) + 66) {
                case 66:
                    Test.instanceCount += (((i16 * i1) + Test.instanceCount) - i1);
                case 67:
                    f -= -114L;
                    break;
                default:
                    i2 += (i16 - i16);
                    i17 <<= 94;
                    iArr = Test.iArrFld;
                    i2 = (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=240, i19=-254, i20=-5, i21=93, i23=-8, i24=-13895, i25=58, i26=14;
        byte by2=-51;
        float f3=-97.506F, f4=59.701F, f5=0.711F, fArr1[]=new float[N];
        double d2=-18.51868, d3=-2.17741;
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr1, 123.774F);
        FuzzerUtils.init(lArr, -2971736978L);

        vMeth(5921, -113, i18);
        by2 >>= (byte)i18;
        for (i19 = 371; i19 > 2; i19 -= 2) {
            if (true) break;
            for (f3 = i19; 136 > f3; ++f3) {
                Test.instanceCount = i20;
            }
        }
        for (int i22 : Test.iArrFld) {
            for (f4 = 1; f4 < 63; ++f4) {
                boolean b2=false;
                Test.instanceCount += (long)f4;
                i21 += (int)Test.instanceCount;
                i23 = 35652;
                switch ((int)((f4 % 10) + 104)) {
                case 104:
                    if (bFld) continue;
                    i23 = i20;
                    i22 *= (int)-2879078002L;
                    i24 = 1;
                    do {
                        f5 += i24;
                        i23 -= i24;
                    } while (++i24 < 2);
                case 105:
                    i22 -= (int)Test.instanceCount;
                    for (i25 = 1; i25 < 2; i25++) {
                        d2 = i23;
                    }
                    Test.fArrFld = fArr1;
                    i21 *= i24;
                    break;
                case 106:
                    bFld = bFld;
                    bFld = bFld;
                    i21 += (int)(f4 + i23);
                    i26 += (int)(f4 + i26);
                case 107:
                    lArr[(int)(f4 - 1)] += Test.instanceCount;
                    break;
                case 108:
                    d3 = d3;
                    f5 -= -85.512F;
                    break;
                case 109:
                    Test.iArrFld[(int)(f4)] += i23;
                    break;
                case 110:
                    try {
                        i21 = (-52 / Test.iArrFld[(int)(f4 - 1)]);
                        i26 = (i24 / -47);
                        i26 = (i23 % -20310);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 111:
                    i22 += (int)((long)f4 ^ Test.instanceCount);
                case 112:
                    if (b2) break;
                    break;
                case 113:
                    i26 += (int)(f4 * i20);
                    break;
                default:
                    Test.instanceCount += -12;
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
//DEBUG  byMeth ->  byMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}