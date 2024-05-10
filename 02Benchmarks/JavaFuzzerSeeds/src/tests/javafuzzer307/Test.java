package tests.javafuzzer307;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:34:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=174L;
    public static float fFld=0.622F;
    public static short sFld=29986;
    public int iFld=115;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -193);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8, int i9) {

        int i10=4161, i11=47378, i12=-7619, i13=-4, iArr[]=new int[N], iArr1[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(iArr1, -14);

        Test.instanceCount >>= i8;
        for (i10 = 11; 178 > i10; ++i10) {
            i12 = 1;
            do {
                Test.sFld -= (short)i9;
                i13 = 1;
                while (++i13 < 3) {
                    iArr[i13] >>>= (int)Test.instanceCount;
                    iArr1[i12] = 6;
                    if (b1) break;
                    Test.fFld += 3;
                    Test.instanceCount -= (long)Test.fFld;
                    b1 = true;
                    Test.sFld = (short)i13;
                    i9 >>>= (int)Test.instanceCount;
                    Test.instanceCount = 38243L;
                    i11 += (((i13 * i8) + Test.instanceCount) - Test.fFld);
                }
            } while ((i12 += 3) < 9);
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i3, int i4, int i5) {

        int i6=-249, i7=165, i14=13;
        double d1=-48.112543;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 65.445F);

        for (i6 = 5; i6 < 377; i6 += 3) {
            double d=91.112246;
            Test.fFld = 222;
            vMeth1(i5, i5);
            Test.fFld *= Test.instanceCount;
            d = i6;
            Test.instanceCount *= Test.instanceCount;
            i3 -= -29132;
            Test.instanceCount <<= Test.sFld;
            i14 = 1;
            do {
                i5 += (i14 * i14);
            } while (++i14 < 13);
        }
        d1 = d1;
        d1 += -6;
        i3 = i14;
        d1 -= d1;
        fArr[(i14 >>> 1) % N] = Test.fFld;
        vMeth_check_sum += i3 + i4 + i5 + i6 + i7 + i14 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public int iMeth(byte by, int i, boolean b) {

        int i1=-4, i2=-94, i15=-157, i16=-10115, i17=-43245, i18=90, i19=7, i20=1, iArr2[]=new int[N];
        double d2=79.38283;

        FuzzerUtils.init(iArr2, 11);

        if (b) {
            Test.fFld += (++Test.instanceCount);
            for (i1 = 11; i1 < 320; i1++) {
                vMeth(i2, i2, i);
                Test.instanceCount += (long)d2;
                i = i;
            }
            i2 = i;
        } else if (b) {
            i2 = -4194;
            for (i15 = 130; i15 > 2; --i15) {
                for (i17 = i15; 12 > i17; i17++) {
                    if (i != 0) {
                    }
                    iArr2 = FuzzerUtils.int1array(N, (int)-2);
                }
                for (i19 = i15; i19 < 12; ++i19) {
                    i = (int)5L;
                    d2 = Test.instanceCount;
                }
            }
        }
        long meth_res = by + i + (b ? 1 : 0) + i1 + i2 + Double.doubleToLongBits(d2) + i15 + i16 + i17 + i18 + i19 +
            i20 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by1=-18;
        int i21=230, i22=45504, i23=18613, i24=-241, i25=-146, i26=-22, i27=-163;
        boolean b2=true;
        double d3=0.18417;
        long lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, -12365L);
        FuzzerUtils.init(sArr, (short)-21476);

        for (long l : lArr) {
            Test.fFld -= ((iMeth(by1, iFld, false) - Test.instanceCount) + iFld);
            iFld = iFld;
            for (i21 = 3; i21 < 63; i21++) {
                Test.instanceCount = l;
                i22 -= (int)l;
                for (i23 = 2; i23 > 1; i23 -= 2) {
                    by1 >>= (byte)i22;
                    b2 = true;
                    try {
                        i25 = (-940315964 / i24);
                        iFld = (Test.iArrFld[i23 - 1] % 11104);
                        i25 = (-24957843 / Test.iArrFld[i21]);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += 54375;
                    d3 *= i25;
                    i24 = i25;
                    l *= by1;
                    i24 += (int)d3;
                    Test.instanceCount += (-34916 + (i23 * i23));
                    if (b2) break;
                }
                i25 += (i21 * i21);
                i22 = (int)Test.instanceCount;
                l += (0 + (i21 * i21));
            }
            for (i26 = 63; i26 > 3; i26--) {
                i22 -= i25;
                i24 >>>= i22;
                sArr[i26] = (short)Test.fFld;
                i27 = (int)10L;
                i22 >>>= by1;
            }
        }
        i24 += i25;


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
