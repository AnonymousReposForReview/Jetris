package tests.javafuzzer2152;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:32:49 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=12L;
    public double dFld=-38.19666;
    public static double dFld1=-99.63175;
    public byte byFld=105;
    public static byte byArrFld[][]=new byte[N][N];
    public static double dArrFld[]=new double[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)34);
        FuzzerUtils.init(Test.dArrFld, -105.129054);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by) {

        float f1=-2.875F;
        int i5=-23296, i6=200, i7=62, i8=8, i9=-51, i10=64, i11=-10731, i12=-3, iArr[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, -5);

        Test.instanceCount *= (long)f1;
        i5 *= i5;
        for (i6 = 6; i6 < 266; i6++) {
            i7 *= 3;
        }
        i5 += i5;
        f1 += Test.instanceCount;
        for (i8 = 5; i8 < 156; i8 += 3) {
            i7 += (((i8 * i9) + i10) - by);
            Test.byArrFld[i8 - 1][i8 + 1] += (byte)i8;
            for (i11 = 31; i11 > 1; --i11) {
                if (i12 != 0) {
                    vMeth2_check_sum += by + Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + (b ?
                        1 : 0) + FuzzerUtils.checkSum(iArr);
                    return;
                }
                if (b) break;
                iArr[i8 + 1] >>= (int)-8L;
                i7 -= i11;
                Test.instanceCount >>= i11;
            }
        }
        vMeth2_check_sum += by + Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i13=38257, i14=-8, i15=0, i16=-2, i17=38161, i18=-3, iArr1[]=new int[N];
        float f2=-14.866F;
        double d=-48.110716;
        short s1=-28928;
        boolean b1=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -82L);
        FuzzerUtils.init(iArr1, 7232);

        vMeth2((byte)(6));
        if (b1) {
            i13 = (int)f2;
            i14 = 1;
            while (++i14 < 383) {
                i13 = (int)f2;
                i13 <<= i14;
                for (i15 = 4; i15 > 1; i15--) {
                    for (d = i15; 2 > d; d++) {
                        Test.dFld1 = s1;
                        if (true) continue;
                        i17 += (int)(((d * i13) + i16) - i16);
                        Test.byArrFld[i15 - 1][i14] >>>= (byte)i15;
                        if (true) {
                            lArr1[(int)(d + 1)] >>>= i18;
                            i16 += (int)((long)d | i16);
                        } else if (b1) {
                            iArr1[i14 + 1] &= i13;
                        } else {
                            Test.instanceCount += (long)(((d * Test.instanceCount) + i14) - i14);
                        }
                    }
                }
            }
        }
        vMeth1_check_sum += i13 + Float.floatToIntBits(f2) + i14 + i15 + i16 + Double.doubleToLongBits(d) + i17 + s1 +
            i18 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i2, int i3, int i4) {

        boolean b2=true;
        int i19=18630, i20=-7, i21=173, i22=63782, i23=48, i24=13;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 7371550199635936871L);

        vMeth1();
        b2 = b2;
        for (i19 = 20; i19 < 334; i19++) {
            Test.dArrFld[i19] += -35127;
            i3 <<= i2;
        }
        for (long l : lArr2) {
            iArrFld[(i3 >>> 1) % N] = i3;
            l = i20;
            i20 += (int)-2.43890;
            for (i21 = 1; i21 < 4; ++i21) {
                i22 += i21;
            }
            for (i23 = 1; i23 < 4; ++i23) {
                i2 += 24;
                i4 += (int)(-6574306303395605453L + (i23 * i23));
                i3 -= (int)l;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + (b2 ? 1 : 0) + i19 + i20 + i21 + i22 + i23 + i24 +
            FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-146, i1=-185, i25=-10, i26=-56138, i27=14348, i28=8, i29=65389, i30=-22436, i31=-8, i32=-45830;
        short s=6657;
        float f=0.964F;
        boolean b3=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -145374593L);

        for (i = 14; i < 327; i++) {
            i1 <<= (int)(-80L - ((s * i) + f));
            i1 -= (int)(dFld * ((++i1) - (250971892L * (i1--))));
            lArr = (lArr = FuzzerUtils.long1array(N, (long)-119L));
        }
        vMeth(219, i1, i1);
        for (i25 = 3; i25 < 243; ++i25) {
            i26 += i;
            lArr[i25] = (long)f;
            for (i27 = 6; i27 < 105; i27++) {
                i28 = (int)Test.instanceCount;
                switch ((i27 % 8) + 97) {
                case 97:
                    b3 = b3;
                    f += i25;
                case 98:
                    i29 = 1;
                    while (++i29 < 2) {
                        i28 = (int)Test.instanceCount;
                        f += i29;
                        iArrFld[i29 + 1] += i28;
                    }
                    for (i30 = 1; i30 < 2; ++i30) {
                        iArrFld[i25 - 1] &= 24;
                        f += (i30 - i29);
                        f += i30;
                        i28 >>= i27;
                    }
                    try {
                        i32 = (i32 / i26);
                        i31 = (i31 / i);
                        i31 = (-373554528 % i25);
                    } catch (ArithmeticException a_e) {}
                case 99:
                    b3 = b3;
                    i1 *= -74;
                case 100:
                    i32 &= i25;
                    break;
                case 101:
                    if (b3) {
                        i28 -= i31;
                        f += (i27 - i32);
                        Test.byArrFld[i25][i27] = (byte)Test.instanceCount;
                    } else {
                        Test.instanceCount += (0 + (i27 * i27));
                    }
                case 102:
                    Test.instanceCount = i26;
                    break;
                case 103:
                    byFld *= (byte)-15;
                    break;
                case 104:
                    b3 = b3;
                    break;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
