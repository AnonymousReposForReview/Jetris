package tests.javafuzzer2868;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 21:54:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4L;
    public static short sFld=8336;
    public int iArrFld[]=new int[N];
    public float fArrFld[]=new float[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(byte by, int i5, int i6) {

        float f1=0.849F;
        int i7=-58, i8=-3, i9=-249, i10=8, i11=14, i12=-253, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -226);

        i5 >>= by;
        Test.instanceCount ^= i5;
        for (f1 = 5; f1 < 205; f1++) {
            i7 += (int)f1;
            for (i8 = 8; f1 < i8; --i8) {
                boolean b=false;
                if (b) continue;
            }
            i10 = 1;
            while (++i10 < 8) {
                Test.sFld -= (short)1.50221;
                i5 -= i7;
                iArr[(int)(f1 + 1)] = i9;
                for (i11 = 1; i11 > 1; i11 -= 2) {
                    switch ((((i12 >>> 1) % 3) * 5) + 48) {
                    case 63:
                        i6 *= i7;
                        break;
                    case 58:
                        i9 += (i11 + i6);
                        iArr[(int)(f1 - 1)] -= i5;
                        break;
                    case 60:
                        i7 >>= (int)Test.instanceCount;
                        break;
                    default:
                        Test.instanceCount = by;
                    }
                }
            }
        }
        long meth_res = by + i5 + i6 + Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + i11 + i12 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i4=-231, i13=-8, i14=-13;
        float f2=-2.636F;
        boolean b1=true;

        i4 += i4;
        iMeth((byte)(36), i4, i4);
        i4 = i4;
        i4 = (int)f2;
        i4 = -37;
        b1 = false;
        for (i13 = 21; i13 < 366; i13++) {
            Test.instanceCount |= i13;
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) + i13 + i14;
    }

    public void vMeth(int i3, float f) {

        double d=-1.50055;
        int i15=-26786, i16=3, i17=206, i18=-35949, i19=-231;
        long l1=-28704L, lArr[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, -168L);
        FuzzerUtils.init(sArr, (short)-17957);

        i3 &= (int)(((-7.111950 - (i3 + i3)) - (iArrFld[(8 >>> 1) % N] = i3)) - ((Test.instanceCount + d) + (f - i3)));
        iArrFld[(i3 >>> 1) % N] *= (int)(Test.instanceCount++);
        vMeth1();
        fArrFld[(i3 >>> 1) % N] = -37284;
        i15 = 1;
        while (++i15 < 128) {
            for (i16 = 1; i16 < 12; i16++) {
                Test.instanceCount -= (long)1.77587;
                lArr[i16 - 1] = (long)f;
                sArr = sArr;
                i17 += (((i16 * i3) + i3) - i15);
                i17 += 8;
            }
            i3 += (int)l1;
        }
        for (i18 = 10; i18 < 325; i18++) {
            l1 -= i17;
        }
        i3 &= i3;
        vMeth_check_sum += i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i15 + i16 + i17 + l1 + i18 + i19
            + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        long l=-7872411973462956732L, l2=6371458106459961783L, lArr1[][]=new long[N][N];
        int i=110, i1=-10, i2=0, i20=8001, i21=-141, i22=-1, i23=-104, i24=242, i25=8, i26=-1;
        float f3=118.644F;
        double d1=1.25041;
        boolean b2=false;
        byte by1=-8, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)27);
        FuzzerUtils.init(lArr1, -2898085300005750220L);

        for (l = 16; l < 300; ++l) {
            for (i1 = 3; i1 < 89; ++i1) {
                vMeth(i2, f3);
            }
            Test.instanceCount = l;
            Test.instanceCount = (long)d1;
            for (i20 = 3; i20 < 89; i20++) {
                if (b2) break;
                iArrFld[(int)(l - 1)] *= i;
                i21 += (((i20 * i1) + i20) - f3);
            }
            Test.sFld *= (short)i20;
            i21 = i20;
            for (i22 = 2; i22 < 89; i22++) {
                i21 = i20;
                i24 = 1;
                while (++i24 < 2) {
                    iArrFld[i24] += (int)234L;
                    try {
                        i23 = (i22 / i23);
                        iArrFld[i24 + 1] = (i21 / -246);
                        iArrFld[(int)(l + 1)] = (i23 % 97);
                    } catch (ArithmeticException a_e) {}
                    iArrFld = iArrFld;
                    byArr[i22 - 1] += (byte)i;
                    iArrFld = iArrFld;
                    f3 += Test.sFld;
                    i23 += (i24 * i24);
                    f3 = i24;
                    i += (i24 + i24);
                }
                for (i25 = i22; i25 < 2; i25++) {
                    iArrFld[i22 + 1] = i2;
                    switch (((i25 % 3) * 5) + 103) {
                    case 109:
                        if (b2) continue;
                        lArr1[(164 >>> 1) % N] = lArr1[i25 - 1];
                        iArrFld[i25 + 1] += (int)Test.instanceCount;
                    case 118:
                        i23 = i;
                        break;
                    case 111:
                        i23 += (((i25 * Test.instanceCount) + l2) - by1);
                        break;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
